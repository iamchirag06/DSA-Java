public class Q1_Practice {
    public static int LinearSearch(String Dish[],String key){
        for(int i=0;i<Dish.length;i++){
            if(Dish[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String Dish[]={"CholeBhature","Rajma Chawal","Chowmein"};
        String key = "Chowmein";

        int index =LinearSearch(Dish,key);

        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is found at Index : "+ index);
        }
    }
}
