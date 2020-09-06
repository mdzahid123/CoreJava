package opps_Concept_01;

public class Box {
	
	double height, width, depth;   // instance variable 
	
	Box(double h, double w, double d){
		
		height = h;
		width = w;
		depth = d; 
	}
	
	void displayVolume() {
		double vol = height * width* depth;
		System.out.println("Volume is : " + vol);
	}

	
}


