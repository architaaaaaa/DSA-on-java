package OOPs;
interface Animals{
    void eat();
}
interface herbivore{
    void plants();
}
class cow implements Animals,herbivore{

    public void eat(){
        System.out.println("cows eats with all teeth.");
    }

    public void plants(){
        System.out.println("cows mostly eat fruits, plants,etc.");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        cow h1= new cow();
        h1.eat();
        h1.plants();
    }
}
