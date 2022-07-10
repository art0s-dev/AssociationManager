import builder.AssociationMemberBuilder;
import builder.Builder;
import builder.Model;
import member.AssociationMember;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Builder builder = new Builder();
        Scanner scanner = new Scanner(System.in);
        Model<AssociationMember> hans = builder.create(new Model<AssociationMember>(), scanner);
    }
}