import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentId;
  private String courses;
  private int balance;
  // static is true to all objects, not just the instance. 
  private static int costOfCourse = 600;
  private static int id = 1001;

    //constructor: asks user for name and year.
  public Student() {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter student first name: ");
      this.firstName = in.nextLine();

      System.out.print("Enter student last name: ");
      this.lastName = in.nextLine();

      System.out.print("Enter student year (1-4): ");
      this.gradeYear = in.nextInt();

      setStudentID();

      System.out.println(firstName + " " + lastName + " " + "Year: " + gradeYear + " " + "id: " + studentId ) ;

      
      
  }

  private void setStudentID() {
    // grade level +ID
    // add "" makes the whole statement come back as a string
    id++; 
    this.studentId = gradeYear + "" + id;

  }
}
