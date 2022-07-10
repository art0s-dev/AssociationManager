package builder;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.Scanner;

public interface CanCommunicate {

    default void displayWelcomeMessage(){
        System.out.print("Welcome to the member builder!" + "\n" +
                "Your data will be displayed when all members are entered into the system");
    }

    default Optional askFor(Field field, Scanner scanner){
        System.out.print("Please enter:"+ ' '+ field.toString() );
        return Optional.of(scanner.nextLine());
    }

    default boolean endDialogue(Scanner scanner){
        System.out.print("Thanks! Would you like to see your results? (Y/n)");
        if (scanner.nextLine() == "Y") return true;
        else return false;
    }

}
