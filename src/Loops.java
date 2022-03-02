public class Loops {

  public static void main(String[] args) {
    //8. While Loops
    int value = 1;
    while (value < 10) {
      System.out.println("hello " + value);
      value++;
    }

    //9. For Loops

    for (int i = 0; i < 5; i++) {
      System.out.printf(" The value of i is %d.\n", i);
    }

    //10. IF
    int myInt2 = 20;
    if (myInt2 < 10) {
      System.out.println("Yes, it's true");
    } else if (myInt2 > 20) {
      System.out.println("No, it's false");
    } else {
      System.out.println("None of the above");
    }
    int loop = 0;
    while (loop > 5) {
      System.out.println("Looping " + loop);
      if (loop == 6) {
        break;
      }
      loop++;
      System.out.println("Running");
    }
  }
}
