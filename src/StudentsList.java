import java.util.ArrayList;

public class StudentsList {

    private final ArrayList<Student> students = new ArrayList<>();

    public void getAveragePoint() {

        for (Student student : students) {
            System.out.println(student.getName() + " GPA is: " + student.getGpa());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int searchStudent(Student student) {
        return students.indexOf(student);
    }

    public String getStudentsList() {
        int count = 1;
        String studentsList = "";

        for (Student student : students) {
            studentsList += (count + ". " + student.getName() + "\n");
            ++count;
        }

        return studentsList;
    }
}
