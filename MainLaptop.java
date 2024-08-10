import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop lt1 = new Laptop(0, "ASUS", 8., 1., "Intel Core i7", "Win10", "white", 500);
        Laptop lt2 = new Laptop(1, "Acer", 12., 2., "Intel Core i7", "Win10", "red", 600);
        Laptop lt3 = new Laptop(2, "DELL", 18., 12., "AMD Ryzen 9", "Win11", "yellow", 800);
        Laptop lt4 = new Laptop(3, "Intel", 18., 10., "Intel Core i7", "Win11", "black", 620);
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(lt1, lt2, lt3, lt4));
        for (Laptop lpt : laptops) {
            System.out.println(lpt);
        }

        Map<String, Object> filterCriteria = Laptop.getFilterCriteria(); // initialize filtering 
        Set<Laptop> filteredLaptops = Laptop.filterLaptops(laptops, filterCriteria);
        for (Laptop lpt : filteredLaptops) {
            System.out.println(lpt);
        }
    }
}
