package sanket.shape;

public class Rectangle {
	float ans;
	public float area1(int l,int b) {
		ans = l * b;
		return ans;
	}
	
	public static void main(String [] args) {
		Square sq = new Square();
		sq.area2(4);
	}
}
