import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String digits = null; // переменная для количества разрядов

        if(number > 999 || number < 1){
            //System.out.println("");
        } else{
            String even = (number%2 == 0)? "четное ": "нечетное ";

            if((number >= 100) && (number <= 999))
                digits = "трехзначное ";
            else if ((number >= 10) && (number <= 99))
                digits = "двузначное ";
            else if ((number >= 0) && (number <= 9))
                digits = "однозначное ";


            System.out.println(even + digits + "число");
        }
    }
}

