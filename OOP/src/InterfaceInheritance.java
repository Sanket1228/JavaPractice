interface TVremote {
    void on();
    void off();
    default void light(){
        System.out.println("LIght on");
    }
}

interface SmartTVremote extends TVremote{
    void showRange();
    void showChannel();

}

class TV implements SmartTVremote{
    public void on(){
        System.out.println("On");
    }
    public void off(){
        System.out.println("Off");
    }
    public void showRange(){
        System.out.println("show range");
    }
    public void showChannel(){
        System.out.println("show channel");
    }
}



public class InterfaceInheritance {
    public static void main(String[] args) {
        TV t = new TV();
        t.on();
        t.off();
        t.showRange();
        t.showChannel();
        t.light();
    }
}
