import java.util.Scanner;
class Arr{
    public static void main(String args[]){
        Scanner c=new Scanner(System.in);
        System.out.println("enter the array elemnts");
        int n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=c.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
       
        
    }
}
