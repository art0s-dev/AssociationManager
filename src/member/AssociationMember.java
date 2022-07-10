package member;

import member.associationCategory;

import java.util.Date;

public class AssociationMember implements CanDisplayItself {
     String id;
     String name;
     String zip;
     associationCategory category;
     Date birthdate;
     String iban;


     //Get & Set
     public String getId() {
          return this.id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getZip() {
          return zip;
     }

     public void setZip(String zip) {
          this.zip = zip;
     }

     public associationCategory getCategory() {
          return category;
     }

     public void setCategory(associationCategory category) {
          this.category = category;
     }

     public Date getBirthdate() {
          return birthdate;
     }

     public void setBirthdate(Date birthdate) {
          this.birthdate = birthdate;
     }

     public String getIban() {
          return iban;
     }

     public void setIban(String iban) {
          this.iban = iban;
     }
}
