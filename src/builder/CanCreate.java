package builder;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public interface CanCreate<T>{

    default <T> Model<T> create(Model<T> model, Scanner scanner) throws NoSuchElementException {
        Model<T> freshModel = new Model<>();
        Optional<Field[]> fieldList = getFieldList(freshModel);
        if(fieldList.isPresent()) {
            Arrays.stream(fieldList.get()).forEach(field -> Locale.filter(isProperySameAsClassType(field)))
        }

        return freshModel;
    }

    static boolean isProperySameAsClassType(Field field) {
        return field.getName() == "classType";
    }

    default <T> Optional<Field[]> getFieldList(Model<T> model){
        return Optional.ofNullable(Model.class.getDeclaredFields());
    }

    default void setData(Field field, String value) throws IllegalAccessException {
        String fieldName = field.getName();
        field.setAccessible(true);
        field.set(field, field.getType().cast(value));
    }

    default Optional<String> retrieveDataFromInput(Scanner scanner, Field field){
        System.out.println("Set attribute for " + field.getName() + " :");
        return Optional.ofNullable(scanner.nextLine());
    }




}
