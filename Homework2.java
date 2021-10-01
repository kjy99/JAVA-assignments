import java.util.Scanner;

//학생의 학번, 이름 ,전공, 전화번호를 속성으로 가지는 클래스
class Student
{
    int studentNum;//학번
    String name;//이름
    String major;//전공
    int phoneNum;//전화번호

    //학번을 개체의 멤버 변수에 저장하는 함수
    void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    //이름을 개체의 멤버 변수에 저장하는 함수
    void setName(String name) {
        this.name = name;
    }

    //전공을 개체의 멤버 변수에 저장하는 함수
    void setMajor(String major) {
        this.major = major;
    }

    //전화번호를 개체의 멤버 변수에 저장하는 함수
    void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    //개체의 학번 멤버 변수를 출력하는 함수
    void getStudentNum() {
        System.out.printf("%d ", studentNum);
    }

    //개체의 이름 멤버 변수를 출력하는 함수
    void getName() {
        System.out.printf("%s ", name);
    }

    //개체의 전공 멤버 변수를 출력하는 함수
    void getMajor()
    {
        System.out.printf("%s ",major);
    }

    //개체의 전화번호 멤버 변수를 출력하는 함수
    void getPhoneNum()
    {
        String phoneNum='0'+Integer.toString(this.phoneNum);
        System.out.printf("%s-%s-%s\n",phoneNum.substring(0,3),phoneNum.substring(3,7),phoneNum.substring(7,11));
    }
}

public class Homework2
{
    public static void main(String[] args)
    {
        Student[] students=new Student[3];
        Scanner sc= new Scanner(System.in);

        for(int i=0; i<3; ++i)
        {
            students[i]=new Student();

            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");

            students[i].setStudentNum(Integer.parseInt(sc.next()));
            students[i].setName(sc.next());
            students[i].setMajor(sc.next());
            students[i].setPhoneNum(Integer.parseInt(sc.next()));
        }

        System.out.printf("\n입력된 학생들의 정보는 다음과 같습니다.\n");

        for(int i=0; i<3 ;++i)
        {
            switch(i)
            {
                case 0:
                    System.out.printf("첫번째 학생: ");
                    break;

                case 1:
                    System.out.printf("두번째 학생: ");
                    break;

                case 2:
                    System.out.printf("세번째 학생: ");
            }

            students[i].getStudentNum();
            students[i].getName();
            students[i].getMajor();
            students[i].getPhoneNum();
        }
    }
}
