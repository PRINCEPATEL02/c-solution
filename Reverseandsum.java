import java.util.Scanner;
class Reverseandsum{
    public void reverse(int[] arr){
        for(int i=0;i<(arr.length)/2;i++){
            int t = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = t;
        }
         System.out.println("the all elements is :");
        for(int i=0;i<(arr.length);i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public void sum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("the sum of all element is :" +sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Reverseandsum s = new  Reverseandsum();
        
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        s.reverse(arr);
        s.sum(arr);
    }
}