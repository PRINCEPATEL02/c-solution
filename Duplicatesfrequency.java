// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Duplicatesfrequency{
    public void  frequency(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int max = arr[0];
        for (int x : arr) {
            if (x < 0) {
                System.out.println("Negative values not supported");
                return;
            }
            if (x > max) max = x;
        }

        int[] brr = new int[max + 1];

        for (int x : arr) {
            brr[x]++;
        }
        
        for(int i=0;i<brr.length;i++){
            if(brr[i] != 0){
                System.out.println(i + " -> " +brr[i]);
            }
        }
    }
    public void duplicate(int[] arr){
        int n = arr.length;
        boolean[] visited = new boolean[n];
        System.out.print("without duplicate array is :  ");
        for(int i = 0;i<n;i++){
            if(visited[i]){
                continue;
            }
            System.out.print(arr[i] + " ");
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Duplicatesfrequency s = new Duplicatesfrequency();
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();
        int[] arr = {1,2,5,2,5,2};
        // for(int i=0;i<n;i++){
        //     arr[i] =  sc.nextInt();
        // }
        s.frequency(arr);
        s.duplicate(arr);
    }
}