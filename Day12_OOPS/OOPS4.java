
public class OOPS4{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Chirag");
        Student s3 = new Student(123);
        // Student s4 = new Student("Aman",123);
    }
}
class Student{
    String name;
    int roll;

    //CONSTRUCTOR OVERLOADING 
    Student(){
        System.out.println("Constructor is called!!");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
