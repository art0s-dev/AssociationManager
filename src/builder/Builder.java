package builder;

import java.util.List;

public class Builder<T extends List> implements CanCreate, CanCommunicate{
    T modelList;

    public T getObjectList(){
        return this.modelList;
    }
    public void setObjectList(T list){
        this.modelList = list;
    }
}
