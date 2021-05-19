public class Array2 {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,6};
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("The given element is found.");
        }
        else{
            System.out.println("The given element is not found.");
        }
    }
}
