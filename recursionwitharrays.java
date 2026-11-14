import java.util.Scanner;
public class recursionwitharrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array: ");
        int amount=sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr=new int[amount];
        for(int i=0; i<amount; i++){
            arr[i]=sc.nextInt();
        }
        display(arr, 0);
    }
    public static void display(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx+1);
    }
}