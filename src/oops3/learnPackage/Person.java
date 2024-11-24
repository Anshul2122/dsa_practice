package oops3.learnPackage;

public class Person {

    int age;
    String name;
    boolean canBeAccessed = false;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(int n){
        if(n%2==0){
            canBeAccessed = true;
        }
        else{
            canBeAccessed = false;
        }
        if(canBeAccessed) {
            return this.age;
        }
        return -1;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.teachingClass = 11;
        t.id = 12321;

    }
}
