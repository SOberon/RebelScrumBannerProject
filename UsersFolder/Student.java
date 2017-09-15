import java.util.*;
import User.java

public class Student extends User(){
	private string major;
	private string residentStatus;
	private string financialData;
	private int socialNumber;

	private Student(string major1, string status, string finances, int ssn){
		this.major1 = major;
		this.status = residentStatus;
		this.finances = financialData;
		this.ssn = socialNumber;
	}

	public string getMajor(){
		return major;
	}

	public string getResidentStatus(){
		return residentStatus;
	}

	public string getFinancialData(){
		return financialData;
	}

	public int getSocialNumber(){
		return socialNumber;
	}

}
