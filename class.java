classes in java
  class car{
    int speed;
    String color;
    String brand;
    String name;
    String fuel;
    void displayInfo(){

        System.out.println("brand"+ "-" + brand + " "+ "speed" + "-"+ speed + " "+"name"+ name +" "+"fuel"+fuel+" "+"color" + color);
    }
}
public class c{
    public static void main(String args[]){
        car car1 = new car();
        car1.speed = 120;
        car1.brand ="TATA";
        car1.name ="Punch";
        car1.fuel="CNG";
        car1.color ="black";
        System.out.println("car details");
        car1.displayInfo();

        car car2 = new car();
        car2.speed = 180;
        car2.brand ="suzuki";
        car2.name ="ertiga";
        car2.color ="white";
        car2.displayInfo();
        
        



    }
}
