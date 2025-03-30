//WAP to print number 1 to 5 and break the loop at number 3
public class ex4 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                System.out.println("code will Break at i = 3");
                break;
            }
            System.out.println(i);
        }
    }
}
