package member;

import member.AssociationMember;

public interface CanDisplayItself {
    default String showInfo(Class AssociationMember, AssociationMember member){
        return null;
    }
}
