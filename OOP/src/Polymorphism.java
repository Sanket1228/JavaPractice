class Monkey{
    void jump(){
        System.out.println("Jumping");
    }

    void bite(){
        System.out.println("Bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void Walk(){
        System.out.println("Walking");
    }
}

public abstract class Polymorphism {
    public static void main(String[] args) {
        BasicAnimal h= new Human();
        h.eat();
        // h.Walk(); --error
    }
}
