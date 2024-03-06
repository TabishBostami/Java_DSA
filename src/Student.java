public class Student {
    String sname ;
    int rollno;

    Student(String name, int rno){
        sname =name;
        rollno = rno;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tabish",21);
        System.out.println(s1.sname);
        System.out.println(s1.rollno);
        System.out.println();

        Student s2 = new Student("Shankar",23);
        System.out.println(s2.sname);
        System.out.println(s2.rollno);
        System.out.println();

        Student s3 = new Student("mithun",420);
        System.out.println(s3.sname);
        System.out.println(s3.rollno);
        System.out.println();

    }
}
