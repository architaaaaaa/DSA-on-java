package OOPs;
class School{
    String name;
    int since;
    String board;

    public static void printInfo(String name){
        System.out.println(name);
    }
    public static void printInfo(int since){
        System.out.println(since);
    }

    public static void printInfo(String name, int since, String board){  //function overloading
        System.out.println(name+", "+ since+ ", "+ board);
    }
    School(){
        System.out.println("constructor called");
    }
}
public class compileTimePolymorphism {
    public static void main(String[] args) {
        School s1= new School();
        s1.printInfo("saint paul's school", 1969, "ICSE");

    }
}
