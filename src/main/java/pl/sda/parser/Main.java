package pl.sda.parser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        List<RealEstate> realEstateList = parser.readFile();  //oznacza że RealEstate to dane z file i tak ma to czytać

        for (Map.Entry<String, Integer> entry : parser.countByCity(realEstateList).entrySet())
            System.out.println(entry.getKey() + "->" + entry.getValue()); //wyświetl dla danego miasta liczbę nieruchomości ??

        for (Map.Entry<String, List<RealEstate>> entry : parser.City(realEstateList).entrySet()) {
            System.out.println(entry.getKey());
            for (RealEstate re : entry.getValue()) {
                System.out.println(" Price: " + re.getPrice()); // wyświetl dla danego miasta ceny nieruchomości.
            }
            System.out.println();

        }
    }

}

//sam sobie nie poradziłem z tym zadaniem, zaglądałem do innych repo jak to powinno wyglądąć
//problemu nie stanowiła dla mnie jedynie klasa RealEstate