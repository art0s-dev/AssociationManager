package builder;

public class Model <T> {

    public T classType;

    public void Model(T classType){
        this.setClassType(classType);
    }

    public T getClassType() {
        return classType;
    }

    public void setClassType(T classType) {
        this.classType = classType;
    }


}
