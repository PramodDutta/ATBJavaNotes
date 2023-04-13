package thetestingacademy.collections.map.MapFatherExample;

import java.util.*;

public class AutomationEx {
    public static void main(String[] args) {

        Student stu1 = new Student(1, "Pramod", "Test@gmail.com", 99999999);
        Student stu2 = new Student(2, "Dutta", "Test@gmail.com", 99999999);
        Student stu3 = new Student(3, "Lucky", "Test@gmail.com", 99999999);
        Student stu4 = new Student(4, "AJIM", "Test@gmail.com", 99999999);
        Student stu5 = new Student(5, "AJU", "Test@gmail.com", 99999999);

        List<Student> stuList1 = new ArrayList<Student>();

        stuList1.add(stu1);
        stuList1.add(stu2);
        stuList1.add(stu3);

        List<Student> stuList2 = new ArrayList<Student>(); //B32
        stuList2.add(stu4);
        stuList2.add(stu5);

        Map<String, List<Student>> ttaATBBatches1 = new TreeMap<String, List<Student>>();
        ttaATBBatches1.put("ATB1", stuList1);
        ttaATBBatches1.put("ATB2", stuList2);

        Map<String, List<Student>> ttaMTBBatches2 = new TreeMap<String, List<Student>>();
        ttaMTBBatches2.put("MTB1", stuList1);
        ttaMTBBatches2.put("MTB2", stuList2);

        Map<String, Map<String, List<Student>>> TTACourses = new HashMap<>();

        TTACourses.put("Automation", ttaATBBatches1);
        TTACourses.put("Manual", ttaMTBBatches2);

        Set<String> courseNames = TTACourses.keySet();
        char ch = 'A';
        for (String cname : courseNames) {
            System.out.println(ch++ + ") Course : " + cname);

            Map<String, List<Student>> batchMap = TTACourses.get(cname);
            Set<String> batchIds = batchMap.keySet();
            for (String batchId : batchIds) { //begin loop 2
                List<Student> stuList = batchMap.get(batchId);
                System.out.println();
                System.out.println("Students of " + batchId + " --- Total : " + stuList.size());
                System.out.println("------------------------ ");
                int count = 1;
                for (Student mystu : stuList) { //loop3
                    System.out.println(count++ + ". " + mystu);
                }
            }


        }
    }


}

class Student {
    int sid;
    String sname;
    String email;
    long phone;

    Student() {
    }

    Student(int sid, String sname, String email, long phone) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    public String toString() {
        String str = sid + "\t" + sname + "\t" + email + "\t" + phone;
        return str;
    }
}