// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 10;
        final String KEY = "number key";

        // Условная конструкция switch
        switch (number) {
            case 1:
                System.out.println(number);
            case 2:
                System.out.println(number);
            case 3:
                System.out.println(number);
            case 4:
                System.out.println(number);
            case 5:
                System.out.println(number);
            case 6:
                System.out.println(number);
            case 7:
                System.out.println(number);
            case 8:
                System.out.println(number);
            case 9:
                System.out.println(number);
            default:
                System.out.println("default");
        }


        final String word = "One";

        switch (word) {
            case "One":
                System.out.println(word);
                break;
            case "Two": {
                System.out.println(word);
                break;
            }
            case "Ten":
                System.out.println(word);
                break;
            default:
                System.out.println("default");
        }


        int age = 19;
        String name = "John";

        if (age == 19 && name != "John" || number == 10 || name == "Radin") {
            System.out.println("Success");
        }

        String username = "Hun123";
        String password = "dhf734943dkfj";

        System.out.println(login(username, password));
        /*System.out.println(getSquare());

        System.out.println(getSquare(20, 40));
        System.out.println(getSquare(3, 7));
        System.out.println(getSquare(8, 10));*/

        swapFunction(20, 10);
        swapFunction(100, 10);
        swapFunction(20, 10);
        swapFunction(20, 10);
        swapFunction(20, 10);


        sayMeow();
        jump();

        System.out.println(getNumber(2));
    }

    public static int getNumber(int number) {
        switch (number) {
            case 1, 2, 3: {
                return number;
            }
            default:
                return number;
        }
    }

    public static String login(String username, String password) {
        if (username != "Hun123" && password == "dhf734943dkfj") {
            return "Welcome back!";
        } else {
            return "Login failed!";
        }
    }

    // Возращающий метод без параметров
    public static int getSquare() {
        return 3 * 5;
    }

    // Возращающий метод с парамтерами
    public static int getSquare(int a, int b) {
        return a * b;
    }

    // Невозвращающий метод с параметрами
    public static void swapFunction(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    public static void sayMeow() {
        System.out.println("Мяу!");
    }

    public static void jump() {
        System.out.println("Прыжок!");
        sayMeow();
    }
}