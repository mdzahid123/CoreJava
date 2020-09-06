package opp_Concept_02;

public class Person {
	
	private String name;  
	private int age; 
	
	
	
	
	/*void display() {	
		System.out.println("Name is: " + name);   
		System.out.println("Age is " + age);
	}*/
	 
	// use of set and get method 
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName () {
		return name;
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public int getAge() {
		return age;
	}
	 
	
	

}
