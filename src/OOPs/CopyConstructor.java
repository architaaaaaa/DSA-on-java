package OOPs;
class car{
    String model;
    int price;
    
    public void printInfo(){
        System.out.println(this.model);
        System.out.println(this.price);
    }
    car( car c2){
        this.model=c2.model;
        this.price=c2.price;
    }
    car(){
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        car c1 = new car();
        c1.model = "Maruti SUV";
        c1.price = 320000;

        car c2 = new car(c1);
        c2.printInfo();
    }
}
