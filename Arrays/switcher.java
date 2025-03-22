import java.util.Scanner;

public class switcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        switch (inp) {
            case "Jesinth":
            case "jesinth":
            case "JESINTH": {
                System.out.println("hello user " + inp);
            }
        }

    }
}
