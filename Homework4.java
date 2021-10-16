import java.util.Scanner;

public class Homework4
{
    static int gcd(int m, int n)
    {
        if(m==0)
        {
            return m;
        }
        else if(m%n==0)
        {
            return n;
        }

        m=m%n;

        return gcd(n , m);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.printf("최대공약수 계산 프로그램.\n두 수를 입력하세요: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.printf("두 수의 최대공약수: " + gcd(a , b));
    }
}
