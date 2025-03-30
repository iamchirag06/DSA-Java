public class OOPS11a {
    public static void main(String[] args) {
            Student s2 = new Student();
            s2.schoolname = "Satyug";
            System.out.println(s2.schoolname);

            Student s3 = new Student();
            System.out.println(s3.schoolname);
            
          }
      }
      class Student {
          static int returnPercent(int eng,int math,int hindi){
              return (eng+math+hindi)/3;
          }
          String name;
          int roll;
      
          String schoolname;

    void setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }

}
