import java.util.*;
class Q3
{
    public static void main(String args[])
    {
        double h,r,v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and radius of cylinder");
        h = sc.nextDouble();
        r = sc.nextDouble();
        v = 3.14*r*r*h;
        System.out.println("Volume = "+v);
    }
}