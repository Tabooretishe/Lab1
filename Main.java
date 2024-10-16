import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int x = in.nextInt();
        boolean Repeat = false;
        if (x/1000==0 || x/10000>0)
            out.print("NO");
        else {
            for(int i=3, xi, a1; i>0; i--) {
                a1=4-i;
                xi=x;
                xi = xi / (int)Math.pow(10,i);
                while(xi>9 && a1>1) {
                    xi=xi%10;
                    a1--;
                }
                for(int u=0, xu, a2; u<i; u++){
                    a2=4;
                    xu=x;
                    xu = xu / (int)Math.pow(10,u);
                    out.println(xu);
                    while(xu>9 && a2>u) {
                        xu = xu % 10;
                        a2--;
                    }
                    out.println(xu);
                    out.println(" ");
                    if (xu == xi)
                        Repeat = true;
            }}
            if (!Repeat)
                out.print("YES");
            else
                out.print("NO");
        }
    }
}