public class TryCatch{
    public static void main(String[] args) {
        try{
        int a = 5/0;
        int b=a;
        System.out.println(b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Bie bie");
        }
        System.out.println("Hello world");
    }
}