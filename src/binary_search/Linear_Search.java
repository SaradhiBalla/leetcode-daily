package binary_search;
import java.util.*;
public class Linear_Search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean found=false;
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();        // array size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Insert element at index "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Target found at"+index);
        }
        else{
            System.out.println("Target not present");
        }
        sc.close();
    }
}
