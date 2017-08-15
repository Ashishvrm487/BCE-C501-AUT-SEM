import java.util.*;
class Problem1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[12];
        int i;
        double mean = 0;
        System.out.println("Enter closing balance of each month");
        for(i=0;i<12;i++)
        {
            arr[i] = sc.nextDouble();
            mean += arr[i];
        }
        mean /= 12;
        System.out.println("\n$"+mean);
    }
}