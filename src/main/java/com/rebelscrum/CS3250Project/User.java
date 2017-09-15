package com.rebelscrum.CS3250Project;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private int idNumber;
    private String userEmail;

    private User(String first, String last, int idNumber, String email){
        this.firstName = first;
        this.lastName = last;
        this.idNumber =idNumber;
        this.userEmail = email;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getidNumber(){
        return idNumber;
    }
    public String getEmail(){
        return userEmail;
    }
}