import java.util.Scanner;
public class LossPercentage{
    public static void main(String[] args)
    {
        float x,y,loss;
        Scanner read=new Scanner(System.in);
        x=read.nextFloat();
        y=read.nextFloat();
        loss=x-y;
        float res=(loss*100)/x;
        System.out.printf("%.2f",res);
    }
}