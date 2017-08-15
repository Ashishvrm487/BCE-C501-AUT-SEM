import java.util.*;
class Q5
{
    public static void main(String args[])
    {
        int sec,h,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds");
        sec = sc.nextInt();
        h = sec/3600;
        sec /= 60;
        m = sec/60;
        sec /= 60;
        System.out.println(h+" hrs "+m+" min "+sec+" sec");
    }
}