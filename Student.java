import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private int studentId;
  private String courses;
  private int balance;
  private int costOfCourse = 600;

    //constructor: asks user for name and year.
  public Student() {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter student first name: ");
      this.firstName = in.nextLine();

      System.out.print("Enter student last name: ");
      this.lastName = in.nextLine();

      System.out.print("Enter student year (1-4): ");
      this.gradeYear = in.nextInt();
  }
}
