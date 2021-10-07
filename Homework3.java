import java.util.Scanner;

public class Homework3
{
    public static void main(String[] args)
    {
        int[] inputs;
        int max, min;
        int num;

        Scanner sc= new Scanner(System.in);
        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        num=sc.nextInt();

        inputs=new int[num];

        System.out.printf("수를 입력하세요: ");

        for(int i=0; i<num; ++i)
        {
            inputs[i]=sc.nextInt();
        }

        max=inputs[0];
        min=inputs[0];

        for(int i=0; i< num-1; ++i)
        {
            if(inputs[i+1]>max)
            {
                max=inputs[i+1];
            }

            if(inputs[i+1]<min)
            {
                min=inputs[i+1];
            }
        }

        System.out.printf("최댓값: "+ max +'\n');
        System.out.printf("최솟값: "+ min + '\n');
    }
}
