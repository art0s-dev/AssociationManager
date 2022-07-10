package builder;

import java.util.*;


public class AssociationMemberBuilder implements CanCommunicate, CanCreate {
    Map memberList;
    Scanner scanner;
    int numberOfMembers;

    public void AssociationMemberBuilder(){

    }

    public Map getMemberList() {
        return memberList;
    }

    public void setMemberList(Map memberList) {
        this.memberList = memberList;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

}
