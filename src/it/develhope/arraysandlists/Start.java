package it.develhope.arraysandlists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start{
    public static void main(String[] args) {
        System.out.println("------------------City not mutable-----------------");
        List<String> cityNames = Arrays.asList("Roma", "Parigi", "Londra");
        System.out.println("City names: " + cityNames);
        List<String> mutableCityNames = new ArrayList<>(cityNames);
        mutableCityNames.add("New York");
        System.out.println("------------------City mutable---------------------");
        System.out.println("City Names mutable: " + mutableCityNames);
        mutableCityNames.set(1, "Tegucigalpa");
        System.out.println("------------------City mutable---------------------");
        System.out.println("City Names mutable: " + mutableCityNames);
        System.out.println("------------------7 King's Rome--------------------");
        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il superbo");
        System.out.println("Kings of Rome: " + kingsOfRome);
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println("Kings of Rome Array: " + Arrays.toString(kingsOfRomeArray));
        System.out.println("---------------------------------------------------");
    }
}

        

        
