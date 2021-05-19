public class Array4 {
    public static void main(String[] args) {
        int [] arr = {1,2,16,4,5,10};
        int max = 0;
        for (int i : arr) {
            if(i > max){
                max = i;
            }
        }
        System.out.println("Maximum number in array is "+max);
    }
}
