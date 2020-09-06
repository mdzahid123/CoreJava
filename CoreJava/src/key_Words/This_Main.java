package key_Words;

public class This_Main {
 
	//school  
	
	String school;
	int code;
	String location; 
	
	
	This_Main(String school, int code, String location){
		this.school = school;
		this.code = code;    // without this keyword here the compiler 
		         			 // will get confuse
		this.location = location;
		
	}
	
	void display() {
		System.out.println("School name is : " + school);
		System.out.println("School code is : " + code);
		System.out.println("School location is  : " + location);
	}
	
}
