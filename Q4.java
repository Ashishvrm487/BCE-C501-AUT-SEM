import java.util.*;
class Q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float cm,in;
        int ft;
        System.out.println("Enter distance in cm");
        cm = sc.nextFloat();
        in = cm / 2.54f;
        ft = (int)(in/12);
        in = in - ft*12;
        System.out.println(ft+"\""+" "+in+"\'");
    }
}