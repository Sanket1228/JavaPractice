public class Recursive_function {
    
    static int addition(int n){
        int sum = n;

        if(n!=0){

            sum = sum + addition(n-1);
        }
        
        
        return sum;
    }
    public static void main(String[] args) {
        int result = addition(5);
        System.out.println("Addition of first n numbers is " + result);
    }
}
