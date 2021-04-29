import java.util.Scanner;

public class WebsiteFinds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Web = sc.nextLine();

        if(Web.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(Web.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(Web.endsWith(".in")){
            System.out.println("This is an indian website");
        }
    }
}