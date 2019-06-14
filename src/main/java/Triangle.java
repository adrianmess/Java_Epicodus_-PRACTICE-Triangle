import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Triangle {
    public static void main (String[] args) {

        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please provide 3 different lengths of your desired Triangle:");


        try {
            System.out.println("Length 1: ");
            int length1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Length 2: ");
            int length2 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Length 3: ");
            int length3 = Integer.parseInt(bufferedReader.readLine());

            if ((length1 > (length2 + length3)) || (length2 > (length1 + length3)) || (length3 > (length1 + length2))) {
                System.out.println("not a valid triangle");

            } else if (length1 == (length2 & length3)) {
                System.out.println("You created an Equilateral Triangle");
            } else if ((length1 == length2) || (length2 == length3) || (length3 == length1)) {
                System.out.println("You created an Isosceles Triangle");
            } else if (((length1 != length2) & (length2 != length3) & (length3 != length1))) {
                System.out.println("You created a Scalene Triangle");
            }
            System.out.println("Type 'exit' to quit Triangle App or hit enter/return key to try again:");
            String choice = bufferedReader.readLine();
        if (choice == "exit") {
            programRunning = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
}

