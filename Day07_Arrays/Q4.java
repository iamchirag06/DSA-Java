public class Q4 {
    public static void ReverseArray(int number[]) {
        int first =0,last=number.length -1;
        while(first<last){
            int tem=number[last];            
            number[last]=number[first];
            number[first]=tem;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        ReverseArray(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
