import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int x = in.nextInt();
        boolean Repeat = false;
        if (x < 1000 || x > 9999)
            out.print("NO");
        else {
            if (x / 1000 == x / 100 % 10)
                Repeat = true;
            if (x / 1000 == x / 10 % 10 % 10)
                Repeat = true;
            if (x / 1000 == x % 10)
                Repeat = true;
            if (x / 100 % 10 == x / 10 % 10 % 10)
                Repeat = true;
            if (x / 100 % 10 == x % 10)
                Repeat = true;
            if (x / 10 % 10 % 10 == x % 10)
                Repeat = true;
            if (Repeat == false)
                out.print("YES");
            else
                out.print("NO");
        }
    }
}
