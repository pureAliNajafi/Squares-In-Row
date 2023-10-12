import java.util.Scanner;

public class App {

    public static void spacing(int space) {
        System.out.print(" ");
    }

    public static void generateStar() {
        System.out.print("*");
    }

    public static void fillSquare(int size) {
        for (int j = 1; j <= size; j++) {
            generateStar();
            spacing(1);
        }
    }

    public static void outLineSquare(int loop, int size) {
        int i = loop;
        for (int k = 1; k <= size; k++) {

            if (k == 1 || k == size)
                generateStar();
            else if (i == 1 || i == size)
                generateStar();
            else
                spacing(1);

            spacing(1);

        }
    }

    public static void squareDiagonals(int loop, int size) {
        int i = loop;
        for (int z = 1; z <= size; z++) {
            if (i == z)
                generateStar();
            else if (i + z == size + 1)
                generateStar();
            else if (z == 1 || z == size)
                generateStar();
            else if (i == 1 || i == size)
                generateStar();
            else
                spacing(1);

            spacing(1);

        }
    }

    public static void squareShapes(int size) {
        for (int i = 1; i <= size; i++) {
            fillSquare(size);
            spacing(4);
            outLineSquare(i, size);
            spacing(4);
            squareDiagonals(i, size);
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number: ");
            if (input.hasNextInt()) {
                int sizeOfsquare = input.nextInt();
                // System.out.println("Valid input");

                squareShapes(sizeOfsquare);

                System.out.println("Do you want to continue? [y/n]");
                String answer = input.next();
                answer = answer.toLowerCase();

                if (!answer.equals("y") && !answer.equals("yes")) {
                    break;
                }
            } else {
                System.out.println("Not a valid number");
                input.next(); // consume invalid input
            }
        }
        input.close();
    }
}
