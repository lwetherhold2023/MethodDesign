import java.util.*;

public class Main {
    public static void main(String[] args) {

        // set up Scanner
        Scanner scan = new Scanner(System.in);

        // set up variables
        String actionInput = "";
        String firstNameInput = "";
        String lastNameInput = "";
        String fullNameInput = "";
        double gradeOneInput = 0;
        double gradeTwoInput = 0;
        double gradeThreeInput = 0;
        int studentIndex = 0;

        // set up ArrayList
        ArrayList<Student> students = new ArrayList<Student>();

        // give info
        System.out.print("In this program, you can add students and set or get their scores. Enter \"stop\" at any time to quit.");

        while(true) {

            // ask for input of action
            System.out.println("\n\nDo you want to add a student \"a\", modify scores \"m\", or access scores \"s\"?");
            actionInput = scan.next();
            System.out.print("\n");

            switch(actionInput.toLowerCase()) {
                case "a":
                    // ask for input of first and last name
                    System.out.print("Enter first name: ");
                    firstNameInput = scan.next();
                    System.out.print("Enter last name: ");
                    lastNameInput = scan.next();
                    System.out.print("\n");

                    // set up Student object
                    Student student = new Student(firstNameInput, lastNameInput);

                    // output info
                    students.add(student);
                    System.out.print(students);
                    break;
                // create a student "c",
                /*case "c":
                    // set up Student object
                    Student createdStudent = new Student();

                    // output info
                    students.add(createdStudent);
                    System.out.print(students);
                    break;*/
                case "m":
                    // ask for input of full name
                    System.out.print("Enter first name: ");
                    firstNameInput = scan.next();
                    System.out.print("Enter last name: ");
                    lastNameInput = scan.next();
                    System.out.print("\n");
                    fullNameInput = firstNameInput + " " + lastNameInput;

                    // ask for input of grades
                    System.out.print("Enter grade for first course: ");
                    gradeOneInput = scan.nextDouble();
                    System.out.print("Enter grade for second course: ");
                    gradeTwoInput = scan.nextDouble();
                    System.out.print("Enter grade for third course: ");
                    gradeThreeInput = scan.nextDouble();
                    System.out.print("\n");

                    // find specified student
                    for (int i = 0; i < students.size(); i++) {
                        if ((students.get(i)).getFullName().equalsIgnoreCase(fullNameInput)) {
                            studentIndex = i;
                            (students.get(i)).setScores(gradeOneInput, gradeTwoInput, gradeThreeInput);
                        }
                    }

                    // notifies user if there are no students or if there are no matching students
                    if (students.size() == 0 || (!(students.get(studentIndex)).getFullName().equalsIgnoreCase(fullNameInput))) {
                        System.out.print("No student in this name.");
                    } else {
                        // output info
                        System.out.print(students);
                    }
                    break;
                case "s":
                    // ask for input of full name
                    System.out.print("Enter first name: ");
                    firstNameInput = scan.next();
                    System.out.print("Enter last name: ");
                    lastNameInput = scan.next();
                    System.out.print("\n");
                    fullNameInput = firstNameInput + " " + lastNameInput;

                    // find specified student
                    for (int i = 0; i < students.size(); i++) {
                        if ((students.get(i)).getFullName().equalsIgnoreCase(fullNameInput)) {
                            // output info
                            studentIndex = i;
                            System.out.print(students.get(i));
                        }
                    }

                    // notifies user if there are no students or if there are no matching students
                    if (students.size() == 0 || (!(students.get(studentIndex)).getFullName().equalsIgnoreCase(fullNameInput))) {
                        System.out.print("No student in this name.");
                    }
                    break;
                case "stop":
                    System.exit(0);
                    break;
                default:
                    // ask for input of action
                    System.out.println("\n\nDo you want to add a student \"a\", modify scores \"m\", or access scores \"s\"?");
                    actionInput = scan.next();
            }

            /*System.out.println("\n\nDo you want to create a student?");
            responseInput = scan.next();
            System.out.print("\n");

            switch(responseInput.toLowerCase()) {
                case "yes":
                    students.add(student);
                    System.out.print(students);
                    break;
                case "stop":
                    System.exit(0);
                default:
                    System.out.println("\n\nDo you want to create a student?");
                    responseInput = scan.next();
            }*/
        }
    }
}