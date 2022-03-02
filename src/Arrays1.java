import java.util.ArrayList;
import java.util.List;
import javax.swing.plaf.synth.SynthStyle;

public class Arrays1 {

  public static void main(String[] args) {
    /////// 14 Arrays////////
    // int value = 7;
    // int[] values;
    // values = new int[3];

    // System.out.println(values[0]);
    // values[0] = 10;
    // values[1] = 20;
    // values[2] = 30;
    // System.out.println(values[0]);
    // System.out.println(values[1]);
    // System.out.println(values[2]);

    // for (int i = 0; i < values.length; i++) {
    //   System.out.println(values[i]);
    // }

    // int[] numbers = { 5, 6, 7 };
    // for (int i = 0; i < numbers.length; i++) {
    //   System.out.println(numbers[i]);
    // }
    /////// 14 Arrays///////
    String[] words = new String[3];
    words[0] = "Hello";
    words[1] = "to";
    words[2] = "you";

    System.out.println(words[2]);

    String[] fruits = { "apple", "bananna", "pear", "kiwi" };

    for (String fruit : fruits) {
      System.out.println(fruit);
    }
    int value1 = 123;
    String text = null;
    System.out.println(text);
    String[] texts = new String[2];
    System.out.println(texts[0]);

    texts[0] = "one";
    ///// 53 ArrayLists//////
    ArrayList<Integer> numbers = new ArrayList<>();
    //Adding
    numbers.add(10);
    numbers.add(100);
    numbers.add(140);
    //retriving
    System.out.println(numbers.get(0));

    //Indexed for loop Iteration
    System.out.println("\n Iteration #1");
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }
    //
    System.out.println("\n Iteration #2");
    for (int num : numbers) {
      System.out.println(num);
    }
    /// Remove items
    numbers.remove(0);
    numbers.remove(numbers.size() - 1);

    List<String> values = new ArrayList<String>();
  }
}
