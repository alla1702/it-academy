package lesson10.Task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Garage {

    public static void main(String[] args) {

        Car mercedes = new Mercedes(112, "Мерседес", "S", 300, 2015, "Седан");
        Car honda = new Honda(111, "Хонда", "Civic", 250, 2014, "Белый");
        Car toyota = new Toyota(113, "Тайота", "Camry", 270, 2000, 2);
        Car mercedes1 = new Mercedes(114, "Мерседес", "S", 300, 2015, "Кроссовер");
        Car honda1 = new Honda(115, "Хонда", "Civic", 250, 2014, "Серый");
        Car toyota1 = new Toyota(116, "Тайота", "Camry", 270, 2000, 4);

        parking(mercedes, honda, toyota, mercedes1, honda1, toyota1);
        carDeparture(mercedes, honda, toyota, mercedes1, honda1, toyota1);
        certainSpeciesCar(mercedes, honda, toyota);
    }

    public static void parking(Car mercedes, Car honda, Car toyota, Car mercedes1, Car honda1, Car toyota1) {
        Map<Object, Integer> garage = new HashMap<>();
        garage.put(mercedes, 1);
        garage.put(honda, 1);
        garage.put(toyota, 1);
        garage.put(mercedes1, 1);
        garage.put(honda1, 1);
        garage.put(toyota1, 1);
        System.out.println("В гараже припарковались : \n" + garage);
    }

    public static void carDeparture(Car mercedes, Car honda, Car toyota, Car mercedes1, Car honda1, Car toyota1) {
        Map<Object, Integer> garage = new HashMap<>();
        garage.put(mercedes, 1);
        garage.put(honda, 1);
        garage.put(toyota, 1);
        garage.put(mercedes1, 1);
        garage.put(honda1, 1);
        garage.put(toyota1, 1);

        garage.remove(honda);
        garage.remove(toyota1);
        garage.remove(mercedes);

        Set<Object> objects = garage.keySet();
        for (Object car : objects) {
            System.out.println("В гараже остались : \n" + car);
        }
    }

    public static void certainSpeciesCar(Car mercedes, Car honda, Car toyota) {
        Map<Object, Integer> garage = new HashMap<>();
        garage.put(mercedes, 1);
        garage.put(toyota, 1);
        garage.put(mercedes, 2);
        garage.put(honda, 1);
        garage.put(toyota, 1);

        int counter = 0;
        Iterator iterator = garage.entrySet().iterator();
        while (iterator.hasNext()) {
            if (garage.get(mercedes) == garage.get(mercedes)) {
                Map.Entry pairCar = (Map.Entry) iterator.next();
                System.out.println(pairCar.getKey() + " = " + pairCar.getValue());
                counter++;
            }
        }
    }
}