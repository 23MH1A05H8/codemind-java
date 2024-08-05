import java.util.Scanner;
public class Frames{
    public static void main(String[] args)
    {
        int l,b,x;
        Scanner read = new Scanner(System.in);
        l=read.nextInt();
        b=read.nextInt();
        x=read.nextInt();
        System.out.println(2*(l+b)*x);
    }
}