import java.util.*;
class Q6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x1=0,x2=0,discriminant,a,b,c;
        System.out.println("Enter the cofficient of x^2 in the quadratic equation");
        a = sc.nextDouble();
        System.out.println("Enter the cofficient of x in the quadratic equation");
        b = sc.nextDouble();
        System.out.println("Enter the value of constant in the quadratic equation");
        c = sc.nextDouble();
        discriminant = b*b - 4*a*c;
        if(discriminant>=0)
        {
            x1 = (-b + Math.sqrt(discriminant))/(2*a);
            x2 = (-b - Math.sqrt(discriminant))/(2*a);
        }
        if(discriminant<0)
        {
            System.out.println("Imaginary Roots");
        }
        else if(discriminant>0)
        {
            System.out.println("Unequal Roots");
            System.out.println("Roots");
            System.out.println(x1+"\t"+x2);
        }
        else
        {
            System.out.println("Equal Roots");
            System.out.println("Roots");
            System.out.println(x1+"\t"+x2);
        }
    }
}