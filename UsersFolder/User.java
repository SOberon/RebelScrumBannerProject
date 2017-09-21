import java.util.*;

public class User{

    private string firstName;
    private string lastName;
    private int idNumber;
    private string userEmail;

    private User(string first, string last, int id, string email){
	this.first = firstName;
	this.last = lastName;
	this.id =idNumber;
	this.email = userEmail;
    }

    public string getFirstName(){
	return firstName;
    }
    public string getLastName(){
	return lastName;
    }
    public int getidNumber(){
	return idNumber;
    }
    public string getEmail(){
	return userEmail;
    }
}
