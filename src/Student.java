public class Student {

    // set up variables
    private String firstName, lastName;
    private double score1, score2, score3;
    private Course course1 = new Course();
    private Course course2 = new Course();
    private Course course3 = new Course();

    public Student() {
        this.firstName = "";
        this.lastName = "";
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setScores(double score1, double score2, double score3) {
        this.course1.setCourseName("Course 1");
        this.course1.setTestScore(score1);
        this.course2.setCourseName("Course 2");
        this.course2.setTestScore(score2);
        this.course3.setCourseName("Course 3");
        this.course3.setTestScore(score3);
    }

    public double getAverage() {
        return (this.course1.getTestScore() + this.course2.getTestScore() + this.course3.getTestScore()) / 3.0;
    }

    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "\nCourses: " + this.course1 + this.course2 + this.course3 + "\nAverage Score: " + getAverage() + "\n\n";
    }
}
