import java.util.Scanner;

public class StudentGradeTracker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] marks = new double[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Student " + (i+1) + " name: ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();
        }

        double total = 0;
        double highest = marks[0];
        double lowest = marks[0];

        for(int i = 0; i < n; i++)
        {
            total += marks[i];

            if(marks[i] > highest)
            {
                highest = marks[i];
            }

            if(marks[i] < lowest)
            {
                lowest = marks[i];
            }
        }

        double average = total;

        System.out.println("\n--- Student Details ---");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Name: " + names[i] + " Marks: " + marks[i]);
        }

        System.out.print("Average Marks: " + average);
        System.out.print("Highest Marks: " + highest);
        System.out.print("Lowest Marks: " + lowest);

        sc.close();
    }
}