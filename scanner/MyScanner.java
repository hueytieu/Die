import java.util.Scanner;
public class MyScanner {
    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");
        while (true) {
            if (scanner.hasNext()) {
                int a = 0;
                int b = 0;
                a = a+scanner.nextInt();
                b = b+1;
                int s = a/b;
                System.out.println("Class: " + s);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}

