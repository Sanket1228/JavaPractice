public class printing_pattern {

    static void pattern(int n){
        while(n>0){
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
