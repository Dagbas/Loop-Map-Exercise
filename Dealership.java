import java.util.*;
public class Dealership {
    public static void main(String[] args) {
        HashMap<String, String> cars = new HashMap<>();
        Scanner customerReq = new Scanner(System.in);
        cars.put("Civic", "Honda");
        cars.put("Camry", "Toyota");
        cars.put("Juke", "Nissan");
        cars.put("F-150", "Ford");
        cars.put("Forester", "Subaru");

        System.out.println("What kind of car are you looking for today?");
        String carReq = customerReq.nextLine();

        if(!cars.containsKey(carReq)) {
            System.out.println("We do not have that particular vehicle ");
        } else {
            System.out.printf("Oh we have that in stock !",carReq, cars.get(carReq));
        }
        }

    }

