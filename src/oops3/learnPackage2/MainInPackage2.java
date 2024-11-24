package oops3.learnPackage2;
import oops3.learnPackage.Teacher;
import oops3.learnPackage.Person;

import java.util.Scanner;

public class MainInPackage2 extends Teacher{
  static  int vaue ;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Person p = new Person();
    Teacher obj = new Teacher();
    obj.teachingClass = 10;
    MainInPackage2 m = new MainInPackage2();
    m.name = "String";
    m.teachingClass = 9;
//        m.id = 22;
//        obj.id = 121;
    p.setAge(233);
    System.out.println(p.getAge(n));
    vaue = 12;
    System.out.println(vaue);
    Math.max(2,2);
  }
}

