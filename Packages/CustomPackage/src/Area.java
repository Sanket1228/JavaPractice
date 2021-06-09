import sanket.shape.*;

public class Area {
	public static void main (String [] args) {
		Circle c = new Circle();
		double res = c.area3(4.3);
		System.out.println("Area of circle : "+res);
		
		Rectangle r = new Rectangle();
		float res1 = r.area1(2, 3);
		System.out.println("Area of rectangle : "+res1);
		
		Square s = new Square();
		float res2 = r.area1(2, 3);
		System.out.println("Area of rectangle : "+res2);
	}		
}
