import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public void add(Student student) {
        for (Student studentControler : students) {
            if (studentControler.getStudentNo() == student.getStudentNo() ||
                    studentControler.getNationalityId() == student.getNationalityId()) {
                System.out.println("Kayıtlı öğrenci");
                return;
            }
        }
        students.add(student);
    }

    public void list() {
        System.out.println("Öğrenciler listelendi ");
        for (Student listStudent : students) {
            System.out.println("Öğrenci adı: " + listStudent.getFirstName() + " Öğrenci Soyadı: " + listStudent.getLastName() +
                    " Öğrenci numarası: " + listStudent.getStudentNo() + " Kimlik Numarası: " + listStudent.getNationalityId() +
                    " Grup: " + listStudent.getGroup());
        }
    }

    public void delete(int id) {
        for (Student deleteStudent : students) {
            if (deleteStudent.getStudentNo() == id) {
                students.remove(deleteStudent);
            } else {
                System.out.println("Öğrenci kayıtlı değil");
                break;
            }
        }
        System.out.println("Öğrenci silindi: ");
    }

    public void update(int id, Student student) {
        for (Student updateStudent : students) {
            if (id == updateStudent.getStudentNo()) {
                updateStudent.setFirstName(student.getFirstName());
                updateStudent.setLastName(student.getLastName());
                updateStudent.setGroup(student.getGroup());

            } else {
                System.out.println("Öğrenci kayıtlı değil");
                break;
            }
        }
    }
}
