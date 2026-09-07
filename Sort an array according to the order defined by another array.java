import java.util.Scanner;


class Arr{
    public static void main(String args[]){
        Scanner c=new Scanner(System.in);
        System.out.println("enter the no of elemnts");
        int n=c.nextInt();
        int[] a=new int[n];
        System.out.println("enter the no of elemnst to the second elemnts");
        int m=c.nextInt();
        int[] b=new int[m];
        for(int i=0;i<a.length;i++){
            a[i]=c.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
            for(int j=0;j<b.length;j++){
                b[j]=c.nextInt();
                
            }
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[j]==b[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("the corrected sorted elements are based on the first array"); 
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }
    }
}
