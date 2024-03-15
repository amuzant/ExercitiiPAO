import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a<=b)
        {
            if(b<=c)
            {
                System.out.print("a="+a+" <= b="+b+" <= c="+c);
            }
            else if(a<=c)
            {
                System.out.print("a="+a+" <= c="+c+" <= b="+b);
            }
            else
            {
                System.out.print("c="+c+" <= a="+a+" <= b="+b);
            }
        }
        else
        {
            if(b>=c)
            {
                System.out.print("c="+c+" <= b="+b+" <= a="+a);
            }
            else if(a<=c)
            {
                System.out.print("b="+b+" <= a="+a+" <= c="+c);
            }
            else
            {
                System.out.print("b="+b+" <= c="+c+" <= a="+a);
            }
        }
    }
}
