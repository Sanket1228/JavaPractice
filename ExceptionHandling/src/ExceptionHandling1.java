import java.util.Scanner;

class NegativeNumberException extends Exception{
	@Override
	public String toString() {
		return "Negative number is not possible";
	}

	@Override
	public String getMessage() {
		return "Negative number is not possible";
	}
}

public class ExceptionHandling1 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try {
			if (a<0) {
				throw new NegativeNumberException();
			}
		}
		catch(ArithmeticException e){
			System.out.println("Hehe");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Haha ");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program Ended....");
		}

	}

}
