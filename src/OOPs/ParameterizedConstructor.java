package OOPs;
class Students{
    String name;
    int age;

    Students(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Students s1= new Students("Aman", 22);
        s1.printInfo();
    }
}
