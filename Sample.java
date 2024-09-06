class Student{
    int rollNo;
    String name;
    int age;
    Student(int rollNo,String name,int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }
    Student(){
         rollNo=0;
         name=" ";
         age=0;
    }
}

public class Sample {
    public static void main(String[] args) {
        Student s1=new Student(101,"A",20);
        Student s2=new Student();
        s2.rollNo=102;
        s2.name="B";
        s2.age=21;

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
