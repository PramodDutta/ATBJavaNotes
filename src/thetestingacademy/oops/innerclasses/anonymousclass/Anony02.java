package thetestingacademy.oops.innerclasses.anonymousclass;

public class Anony02 {
    public static void main(String[] args) {
//            MyStudent myStudent = new MyStudent();
//            myStudent.setId();

        Student student = new Student() {
            @Override
            public void setId() {
                System.out.println(id);
            }
        };
        student.setId();
    }
}

interface Student{
    int id = 11;
    void setId();
}

//class MyStudent implements Student{
//
//    @Override
//    public void setId() {
//        System.out.println(id);
//    }
//}
