import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        int a,b,c,d,p;
        double gm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 Numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = a*b*c*d;
        gm = Math.pow(p,0.25);
        System.out.println("Multiplication = "+p);
        System.out.println("Geometric Mean = "+gm);
    }
}