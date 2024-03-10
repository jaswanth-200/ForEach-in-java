import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
public class ForEach{
    public static void main(String args[])
    {
      List <Integer> nums=new ArrayList<>();
      nums.add(2);
      nums.add(4);
      nums.add(6);
      nums.add(8);
      Consumer<Integer> numbers=new Consumer<Integer>()
      {
        public void accept(Integer n)
        {
            System.out.println(n);
        }
      };
      nums.forEach(numbers);
    }
}
