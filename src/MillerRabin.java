import java.util.Scanner;

public class MillerRabin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n=sc.nextInt();
        System.out.print("Enter the base a=");
        double a=sc.nextInt();
        double k=0,m=0;
        int temp=n-1;
        while (temp%2==0){
            k=k+1;
            temp=temp/2;
        }
        m=temp;
        int f=0;
        System.out.println("k="+k+"     m="+m);
        double b=Math.pow(a,m)%n;
        if(b==1){
            System.out.println("Prime");
        }
        else {
            for (int i = 0; i < k; i++) {
                System.out.println("i="+i);
                b=(b*b)%n;
                if(b==n-1) {
                    System.out.println("N is prime");
                    f=1;
                    break;
                }
                else if(b==1){
                    System.out.println("N is composite");
                    f=1;
                    break;
                }

            }
            if(f==0){
                System.out.println("N is composite");
            }
        }
    }
}
