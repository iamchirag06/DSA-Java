//access modifiers
public class OOPS2{
    public static void main(String[] args){
        BankAccount myacc = new BankAccount();
        myacc.username="Chirag Singh";
        myacc.setPassword("Qwerty");

        System.out.println(myacc.username);
    }
}
class BankAccount{
    public String username;
    @SuppressWarnings("unused")
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
    

}