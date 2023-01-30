public class Course {

    // set up variables
    private String courseName;
    private double testScore;

    public Course() {
        this.courseName = "";
        this.testScore = 0;
    }

    public Course(String courseName, double testScore) {
        this.courseName = courseName;
        this.testScore = testScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public double getTestScore() {
        return this.testScore;
    }

    public String toString() {
        return getCourseName() + " (" + getTestScore() + "%) ";
    }
}
