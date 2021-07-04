import java.util.HashSet;

public class Hashsettest {
    public static void main(String[] args){
        HashSet<String>cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("Tata");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        System.out.println(cars);
        System.out.println("................");
        System.out.println(cars.contains("Mazda"));
        System.out.println("................");
        cars.remove("Volvo");
        System.out.println(cars);
        System.out.println("................");
        for(String i: cars){
            System.out.println(i);
        }
    }
}

