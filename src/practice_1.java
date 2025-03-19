class Student{
    int rollNO = 34;
    String name = "rahul";
    float percentage = 23.3f;

    void greeting(){
        System.out.println("HELLO!! "+this.name);
    }

    Student(){
        this.name = name;
        this.rollNO = rollNO;
        this.percentage = percentage;
    }
}

public class practice_1 {
    public static void main(String[] args) {

        Student anshul = new Student();
        System.out.println(anshul.name);
        System.out.println(anshul.rollNO);
        System.out.println(anshul.percentage);
        Student rahul = new Student();
        rahul.greeting();
        System.out.println(rahul.name);
        System.out.println(rahul.rollNO);
        System.out.println(rahul.percentage);


        int a =2;
        a = 6;
        anshul.greeting();

    }
}
