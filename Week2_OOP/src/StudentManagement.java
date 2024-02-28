public class StudentManagement {
    Student[] students = new Student[100];
    int num = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    void addStudent(Student newStudent) {
        if (newStudent != null) {
            students[num] = newStudent;
            num++;
        }
    }

    String studentsByGroup() {
        String a = "";
        String gr = "";
        int count = 0;
        boolean[] check = new boolean[num];
        for (int i = 0; i < num; i++) {
            check[i] = false;
        }
        while (count < num) {
            for (int i = 0; i < num; i++) {
                if (!check[i]) {
                    gr = students[i].getGroup();
                    a = a + gr + "\n";
                    for (int j = i; j < num; j++) {
                        if (students[j].getGroup().equals(gr)) {
                            a = a + students[j].getInfo() + "\n";
                            check[j] = true;
                            count++;
                        }
                    }
                }
            }
        }
        return a;
    }

    void removeStudent(String id) {
        if (num == 0) {
            return;
        }
        for (int i = 0; i < num - 1; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i + 1; j < num; j++) {
                    students[j - 1] = students[j];
                }

                num--;
                students[num] = null;
                return;
            }
        }
        if (students[num - 1].getId().equals(id)) {
            num--;
            students[num] = null;
        }
    }

    /**main.*/
    public static void main(String[] args) {

        Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        s1.setGroup("K62CC");

        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        s2.setGroup("K62CC");

        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        s3.setGroup("K62CB");

        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s4.setGroup("K62CB");

        StudentManagement list = new StudentManagement();

        list.addStudent(s1);
        list.addStudent(s2);
        list.addStudent(s3);
        list.addStudent(s4);

        System.out.println(list.studentsByGroup());

        list.removeStudent("17020002");

        System.out.println(list.studentsByGroup());
    }
}
