public class Student {
    private String firstName;
    private String lastName;
    private int studentNo;
    private int nationalityId;
    private String group;

    public Student (String firstName, String lastName, int studentNo, int nationalityId, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.group = group;
        this.studentNo = studentNo;

    }

    public Student () {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
