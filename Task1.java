import java.util.Scanner;
import java.util.Arrays;
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            arr[i]+=1;
        }
        Arrays.sort(arr);
        int j=arr.length-1;
        int count=0;
        while(count<5){
            System.out.print(arr[j--]+" ");
            count++;
        }
        sc.close();

    }
    
}

