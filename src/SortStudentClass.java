import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(106428, "Maria", "1256 Ocean View"));
        students.add(new Student(106100, "Stefan", "6701 Megan Street"));
        students.add(new Student(106502, "Bella", "679 Palm Drive"));
        students.add(new Student(106028, "Olivia", "5324 Reseda Blvd"));
        students.add(new Student(106403, "Harry", "Privet Drive 4"));
        students.add(new Student(106544, "Anastasia", "2083 Pomona Street"));
        students.add(new Student(106003, "Natalia", "9032 Ross Ave"));
        students.add(new Student(106324, "Ivy", "6749 Oak Drive"));
        students.add(new Student(106898, "Helen", "6492 Anat Blvd"));
        students.add(new Student(106441, "Ginny", "9374 Winter Street"));

        System.out.println("Array sorted by name: \n");

        for (int i = 0; i < sortByName(students).size(); i++) {
            System.out.println(sortByName(students).get(i).toString());
        }

        System.out.println("\nArray sorted by roll number: \n");

        for (int i = 0; i < sortByRollNumber(students).size(); i++) {
            System.out.println(sortByRollNumber(students).get(i).toString());
        }
    }

    public static ArrayList<Student> sortByName(ArrayList<Student> studentsList) {
        for (int i = 0; i < studentsList.size() - 1; i++) {
            for (int j = 0; j < studentsList.size() - 1 - i; j++) {
                if (studentsList.get(j).getName().compareTo(studentsList.get(j + 1).getName()) > 0) {
                    Student student = studentsList.get(j);
                    studentsList.set(j, studentsList.get(j + 1));
                    studentsList.set(j + 1, student);
                }
            }
        }
        return studentsList;
    }

    public static ArrayList<Student> sortByRollNumber(ArrayList<Student> studentsList) {
        for (int i = 0; i < studentsList.size() - 1; i++) {
            for (int j = 0; j < studentsList.size() - 1 - i; j++) {
                if (studentsList.get(j).getRollNumber() > studentsList.get(j + 1).getRollNumber()) {
                    Student student = studentsList.get(j);
                    studentsList.set(j, studentsList.get(j + 1));
                    studentsList.set(j + 1, student);
                }
            }
        }
        return studentsList;
    }
}