public class Application {
    public static void main(String[] args) {
        Student oleg = new Student("Oleg", "Smetanka", 21, 90);
        Student tania = new Student("Tania", "Molochko", 22, 67);
        Student misha = new Student("Misha", "Maslo", 19, 75);
        Student yarik = new Student("Yarik", "Kotliarevskii", 40, 10);

        StudentsList list = new StudentsList();

        list.addStudent(oleg);
        list.addStudent(tania);
        list.addStudent(misha);
        list.addStudent(yarik);

        list.removeStudent(yarik);

        String studentsList = list.getStudentsList();

        list.getAveragePoint();

        System.out.println(misha.getName() + "'s index in list is: " + list.searchStudent(misha));

        System.out.println(studentsList);

    }
}
