public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.add(new Student("Fırat", "Şimşek", 1,1,"a"));
        studentManager.add(new Student("Ahmet","Çalık",2,2,"b"));
        studentManager.list();
        studentManager.update(1,new Student("Aybars","Mirze",1,1,"a"));
        studentManager.list();
        studentManager.delete(1);
        studentManager.list();
    }
}