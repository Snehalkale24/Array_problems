import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;
}

public class studMang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s[] = new Student[10];
        int count = 0;

        // Add Students
        System.out.print("How many students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            s[i] = new Student();

            System.out.print("Enter Id: ");
            s[i].id = sc.nextInt();

            System.out.print("Enter Name: ");
            s[i].name = sc.next();

            System.out.print("Enter Marks: ");
            s[i].marks = sc.nextDouble();

            count++;
        }

        // Display All Students
        System.out.println("\nStudent Records");

        for (int i = 0; i < count; i++) {
            System.out.println(
                    s[i].id + " " +
                    s[i].name + " " +
                    s[i].marks);
        }

        // Search Student
        System.out.print("\nEnter ID to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (s[i].id == search) {
                System.out.println("Found");
                System.out.println(s[i].id + " "
                        + s[i].name + " "
                        + s[i].marks);
            }
        }

        // Highest Marks
        double max = s[0].marks;
        String top = s[0].name;

        for (int i = 1; i < count; i++) {
            if (s[i].marks > max) {
                max = s[i].marks;
                top = s[i].name;
            }
        }

        System.out.println("\nHighest Marks:");
        System.out.println(top + " : " + max);

        // Average Marks
        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += s[i].marks;
        }

        System.out.println("Average = " + (sum / count));

    }
}