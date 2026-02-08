import java.util.Scanner;
class Rotatearray{
    
    public void leftrotate(int[] arr , int x){
        int  k = x;
        int n = arr.length;
        for(int j=1;j<=k;j++){
            
            int t = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = t;
        }
        System.out.print("left rotated array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public void rightrotate(int[] arr , int x){
        int k = x;
        int n = arr.length;
        for(int j=1;j<=k;j++){
            int t = arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = t;
        }
        System.out.print("right rotated array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rotatearray a = new Rotatearray();
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        System.out.println("enter a array of element  : ");
        int[] arr =  new int[n];
        int[] brr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            brr[i] = arr[i];
        }
        System.out.println("enter a left and right rotate key enter: ");
        int x = sc.nextInt();
        a.leftrotate(arr,x);
        a.rightrotate(brr,x);
    }
}