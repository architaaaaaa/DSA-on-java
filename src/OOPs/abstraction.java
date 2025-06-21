package OOPs;
abstract class Animal{
    abstract void eat();
    final void wayEating(){
        System.out.println("eating with the help of teeth");
    }
    public void type(){
        System.out.println("multiple types");
    }
}
class horse extends Animal{
    void eat(){
        System.out.println(" horse is eating");
    }
}
class rabbit extends Animal{
    void eat(){
        wayEating();
    }
}
public class abstraction {
    public static void main(String[] args) {
        horse h1= new horse();
        h1.eat();
        rabbit r1= new rabbit();
        r1.eat();
    }
}
