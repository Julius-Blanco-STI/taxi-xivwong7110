
public class Main {
	
	public static void main (String[ ] args) {
		Taxi x = new Taxi ("XIV 911") ;
		x.run ( );
		x.printCurrentLocation( );
			//x: , y:3
		x.book( );
		x.run( );
		x.reachedDestination( );
	}
}