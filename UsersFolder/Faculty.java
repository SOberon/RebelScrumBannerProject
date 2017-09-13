import java.util.*;
import User.java

public class Faculty extends User(){
	private string department;
	private string status;
	private string courses;

	private Faculty(string d, string s, string c){
		this.d = department;
		this.s = status;
		this.c = courses;

	}

	public string getDepartment(){
		return department;
	}

	public string getStatus(){
		return status;
	}

	public string getCourses(){
		return courses;
	}

}
