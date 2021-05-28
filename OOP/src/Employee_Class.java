class Employee{
    private String name;
    int salary;

    public int getSalary(){
        return salary;
    }

    public void setName(String Name){
        name = Name;
    }

    public String getName(){
        return name;
    }

}

public class Employee_Class {
    public static void main(String[] args) {
        Employee e = new Employee();
        int sal = e.salary = 3000;
        System.out.println(sal);
        e.getSalary();
        e.setName("Sanket");
        String name = e.getName();
        System.out.println(name);
    }
}
