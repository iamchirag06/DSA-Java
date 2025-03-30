//types of constructor
// 1.copy constructor : shallow and deep
// 2. parameterized
// 3. non-parameterized
public class OOPS5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 456;
        s1.name = "Chirag Singh";
        s1.pw = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.pw = "xyz";
        s1.marks[2]=110;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student {
    String name;
    int roll;
    String pw;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Hii");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    //Shallow Copy Constructor : it reflect the  changes in the copy 

    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //Deep Copy : it doesn't refelect the changes in the copy 
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

}