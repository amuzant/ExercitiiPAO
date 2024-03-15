import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a=1,b=2;
        int aux;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++)
        {
            aux=b;
            b+=a;
            a=aux;
            System.out.print(b+" ");
        }
    }
}
