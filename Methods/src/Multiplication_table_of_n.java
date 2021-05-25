public class Multiplication_table_of_n {

    static void table(int n){
        int i=1;
        while(i<=10){
            System.out.format("%d X %d = %d\n",n,i,n*i);
            i++;
        }
    }

    public static void main(String[] args) {
        table(2);
    }
}
