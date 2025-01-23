import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();

        int i = 0;

        while (i < numStudents) {
            int grade = scanner.nextInt();

            if (grade >= 38 && (grade % 5) >= 3) {
                grade = grade + (5 - (grade % 5));
            }
            System.out.println(grade);
            i = i + 1;
        }
        scanner.close();
    }
}
