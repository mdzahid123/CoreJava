package key_Words;

public class Super_04 extends Super_03{

	int gear; 
	
	Super_04(String c, int w, int g ) {
		
		super(c,w); // this super constructor always has tobr in frist line 
	
		gear = g;
	}
	
	
	@Override
	void attribute() {
		super.attribute();
		System.out.println("Geafr is : " + gear);
		
	}
	
	
	
}
