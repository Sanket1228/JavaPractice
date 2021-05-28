class Base{
    int a;
    Base(){
        System.out.println("I am base class constructor.");
    }

    Base(int x){
        this.a = x;
        System.out.println("I am base class constructor. x = "+a);
    }
}

class Derived extends Base{

    Derived(int x){
        super(x);
        System.out.println("I am Derived class constructor.");
        
    }
}

class Derived2 extends Derived{
    Derived2(int a){
        super(a);
        System.out.println("I am Derived2 class constructor. a is "+a);
    }
}

public class ConstructorInJava{
    public static void main(String[] args) {
        // Derived d = new Derived(5);
        Derived2 d = new Derived2(6);

    }
}