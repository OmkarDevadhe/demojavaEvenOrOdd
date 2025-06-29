package demojavaEvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd {

    int value;
    boolean Result;
    public static void main(String[] args) {
        EvenOrOdd p1 = new EvenOrOdd();
        p1.value = p1.getValueFromUser();
        p1.Result=p1.valueIsEvenOROdd();
        System.out.println(p1.Result);
    }

    int getValueFromUser() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Value : ");
        value = sc.nextInt();

        sc.close();
        return value;
    }

    boolean valueIsEvenOROdd() {
        if (value % 2 == 0)
            return true;
        return false;

  }

}