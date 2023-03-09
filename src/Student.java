public class Student {
    private String name;
    private String lastName;
    private int age;
    private int score;

    public Student(String name, String lastName, int age, int score) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int gpa) {
        this.score = score;
    }
}
