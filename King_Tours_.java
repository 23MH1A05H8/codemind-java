import java.util.Scanner;
public class KingTours{
    public static void main(String[] args)
    {
        int n,m;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        m=read.nextInt();
        System.out.println((n*5)+(m*7));
    }
}