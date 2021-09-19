import java.util.Scanner;

public class Homework1
{
    public static void main(String[] args)
    {
        int integers[]=new int[5];
        int sum=0;

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<5; ++i)
        {
            System.out.printf("정수를 입력하세요: ");
            integers[i] = sc.nextInt();

            sum += integers[i];
            System.out.printf("현재까지 입력된 정수위 합은 %d입니다.\n", sum);
        }
    }
}
