import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter # of elements in array: ");
        int amount=sc.nextInt();
        int[] arr=new int[amount];
        System.out.println("enter elements: ");
        for(int i=0; i<amount; i++){
            arr[i]=sc.nextInt();
        }
        rev(arr, 0);
    }
    public static void rev(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        rev(arr, idx+1);
        System.out.println(arr[idx]);
    }
}