
// Import the HashMap class
import java.util.HashMap;

public class Hashmaptest {
    // Create a HashMap object called capitalCities
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England","London");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("Germany","Berlin");
        System.out.println(capitalCities);
        System.out.println("..................");
        System.out.println(capitalCities.get("England"));
        System.out.println("..................");
        capitalCities.remove("England");
        System.out.println(capitalCities);


    }
}
