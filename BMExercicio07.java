/**
 * BMExercicio07
 */
public class BMExercicio07 {

  public static void main(String[] args) {
    int x = 13;
    int y = 0;

    while (x != 1) {
      y = x%2 == 0 ? x/2 : 3 * x + 1;
      System.out.println(y);
      x = y;
    }
  }
}