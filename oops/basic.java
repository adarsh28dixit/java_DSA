package oops;



public class basic {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="prince";
        p1.age=12;

        Person p2 = new Person(21, "adarsh");
        
        
        System.out.println(p2.name+" "+p2.age);

       
        p2.eat();
    }
}
class Person{
    String name; //properties
    int age;

    static int count;
    public Person(){
        count++;
        System.out.println("creating an object");
    }

    public Person (int newage, String newname){
        name = newname;
        age = newage;
    }

    void eat(){ //behaviour
        System.out.println(name+" i am eating mango");
    }
}
