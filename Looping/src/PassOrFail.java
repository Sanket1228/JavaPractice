import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte phy,chem,bio;
        System.out.print("Enter the marks of Physics : ");
        phy = sc.nextByte();
        System.out.print("Enter the marks of Chemistry : ");
        chem = sc.nextByte();
        System.out.print("Enter the marks of Biology : ");
        bio = sc.nextByte();

        int total = (phy + chem + bio) / 30 * 100;
        if (total > 40 && phy >=33 && chem >= 33 && bio >= 33 ) {
            System.out.println("You are passed"); 
            
        } else {
            System.out.println("You are failed");
        }
    }
}
