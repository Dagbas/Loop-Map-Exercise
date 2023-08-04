import java.io.Console;
import java.util.*;


public class ArrayPractice {

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum=0;
        int product =1;
        int largest =0;
        int smallest = 0;

        for(int i =0; numbers.size() <= 5; i++) {
            System.out.println("Please enter a number:");
            int input= num.nextInt();
            num.nextLine();
            numbers.add(input);
        }

        for(int i : numbers ) {
            largest = numbers.get(0);
            smallest = numbers.get(0);

            sum += i;
            product *= i;
            if (i > largest) {
                largest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
            System.out.println(sum);
            System.out.println(product);
            System.out.println(smallest);
            System.out.println(largest);
        }





    }
}
