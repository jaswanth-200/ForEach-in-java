import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public class ForEach {
    public static void main(String args[]) {
        // Creating a list of integers
        List<Integer> nums = new ArrayList<>();
        
        // Adding elements to the list
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        
        // Creating a consumer to print each element
        Consumer<Integer> numbers = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        
        // Using forEach to iterate through the list and apply the consumer
        nums.forEach(numbers);
    }
}
//compleated
