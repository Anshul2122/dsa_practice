class Person{
    String name;
    int age;

    public Person(int new_age, String new_name) {
        this.name = new_name;
        this.age = new_age;
    }

    public Person() {
        System.out.println("Person constructor is called");
    }

    void walk(){
        System.out.println(name + " walked today");
    }
    int walk(int n) {
        System.out.println(name + " is " + age + " years");
        return n;
    }
}

class Developer extends Person{

    public Developer(int new_age, String new_name) {
        super(new_age, new_name);
    }
    void walk(){
        System.out.println("this is developer class");
    }
    int walk(int n){
        System.out.println("this is developer class and second method");
        return 2;
    }

    public Developer() {
        System.out.println("Developer constructor is called");
    }
}

public class ploy {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "rahul";
        p1.age = 24;
        p1.walk();
        int p2 = p1.walk(4);
        System.out.println(p2);
        Developer d1 = new Developer();
        d1.name = "XFDF";
        d1.age = 24;
        System.out.println(d1.name+ " " + d1.age);
        d1.walk();
        d1.walk(24);

    }
}
