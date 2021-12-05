import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Iterator;

public class Homework9
{
    public static void main(String[] args) throws IOException
    {
        HashMap<String, String> idPw = new HashMap<String, String>();
        FileInputStream f= new FileInputStream("db.txt");
        boolean loopBreak=false;
        boolean end=false;
        int readChar;

        Scanner sc= new Scanner(System.in);

        StringBuilder readId = new StringBuilder();
        StringBuilder readPw = new StringBuilder();

        String inputId;
        String inputPw;

        readChar = f.read();

        while (readChar != -1)
        {
            while(!loopBreak)
            {

                if((char)readChar==' '|| (char)readChar=='\n')
                {
                    readChar= f.read();
                    loopBreak=true;
                    continue;
                }
                readId.append((char)readChar);
                readChar= f.read();
            }

            loopBreak=false;

            while(!loopBreak)
            {
                if((char)readChar==' '|| (char)readChar=='\n'||readChar==-1)
                {
                    readChar= f.read();
                    loopBreak=true;
                    continue;
                }
                readPw.append((char)readChar);
                readChar= f.read();
            }

            loopBreak=false;

            idPw.put(readId.toString(),readPw.toString());
            readId.delete(0, readId.length());
            readPw.delete(0, readPw.length());
        }

        Iterator<String> keys=idPw.keySet().iterator();

        while(keys.hasNext())
        {
            String key =keys.next();
            System.out.printf("key= %s, value= %s\n",key, idPw.get(key));
        }

        while(!end)
        {
            System.out.printf("id와 password를 입력해주세요.\n");
            System.out.printf("id: ");
            inputId=sc.nextLine();
            inputId=inputId.trim();

            if (!idPw.containsKey(inputId))
            {
                System.out.printf("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n\n");
                continue;
            }

            System.out.printf("Password: ");
            inputPw=sc.nextLine();
            inputPw=inputPw.trim();

            if(!inputPw.equals(idPw.get(inputId)))
            {
                System.out.printf("%s\n",idPw.get(inputId));
                System.out.printf("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n\n");
                continue;
            }

            System.out.printf("id와 비밀번호가 일치합니다.\n");
            end=true;
        }
    }
}
