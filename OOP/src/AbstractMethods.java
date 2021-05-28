abstract class Pen{
    abstract void write();
    abstract void fill();
}

class Compass extends Pen{
    public void write(){
        System.out.println("Writing");
    }
    public void fill(){
        System.out.println("filling");
    }
}

public class AbstractMethods {
    public static void main(String[] args) {
        Compass c = new Compass();
        c.write();
        c.fill();
    }
}
