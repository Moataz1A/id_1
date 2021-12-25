package calculator_github;
import java.util.ArrayList;
import java.util.Scanner;
public class id_signup {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> ID = new ArrayList();
        String a = "";
        String uninummber = "12019";
        while (true)
        {
            System.out.print(uninummber + " - ");
            String ai = in.next();
            if (ai.equals("*")) 
            {
                for (int i = 0; i < ID.size(); i++) 
                {
                    System.out.println("رقم الطالب : " + ID.get(i));
                }
                break;
            } else {
                if (ai.length() == 4) 
                {
                    try {
                        int inputnumber = Integer.parseInt(ai);
                        ID.add(uninummber + inputnumber);
                    } catch (NumberFormatException ex) {
                        System.out.println("please enter a vaild nummber without any chars or words");
                    }
                } else {
                    System.out.println("Error please enter a vaild number");
                }
            }
        }
    }
}
