package opps_Concept_01;

public class StaticMethod {
			//স্ট্যাটিক মেথড ব্যবহার কইল্লে কি অয় না কইল্লে কি অয় 
	    // inside a static method non static can't be use 
	  // but static method can be used in non static method 
	
	void display1() {
		System.out.println(" ১. আই স্ট্যাটিক মেথড ব্যবহার করি নাই " + 
				"\n" + 
				"আরে ডাইকত্তে অইলে অবজেক্ট বানান লাইগব৷ ");
		System.out.println();
	} 
	static void display2() {
		System.out.println(" ২. আই  স্ট্যাটিক মেথড ব্যবহার কচ্ছি\n" + 
				"আরে ব্যবহার কইত্তে অইলে অবজেক্ট বানান লাগতনা৷ ");
		System.out.println();
		System.out.println("৩. আরে সালার পুতেরা চুপ কর 🤫৷");
	}
}
