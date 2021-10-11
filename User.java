import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    public static boolean isValidname(String name){

        String S="^[a-zA-Z][a-zA-Z\\d]$";

        Pattern p=Pattern.compile(S);

        if(name==null)
        {
            return false;
        }
        Matcher m=p.matcher(name);
        return m.matches();
    }
    public static int isValidAge(int age){
        if(age>18){
            System.out.println("Eligible!!for voting");
        }else{
            System.out.println("not Eligible for voting");
        }
        return age;
    }
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);

            System.out.println("Enter name");
            String name=s1.nextLine();
            System.out.println("Enter age");
            int age=s1.nextInt();
           Boolean result1=isValidname(name);
            int result2=isValidAge(age);
    }
}




