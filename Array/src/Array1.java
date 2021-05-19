public class Array1 {
    public static void main(String[] args) {
        float [] arr = {1.3f,4.3f,5.4f,6.7f,7.6f};
        float sum = 0;
        for (float f : arr) {
            sum = sum + f;
        }
        System.out.println(sum);             
    }    
}
