package OOPs;
class Student{
    String name;
    int age;

    Student(){ //non-parameterized constructor
        System.out.println("constructor called.");
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class NonParameterizedConstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Aman";
        s1.age= 22;

        s1.printInfo();
    }
}
