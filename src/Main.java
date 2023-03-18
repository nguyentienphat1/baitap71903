import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a,b,c;
        float delta=0;
        float x1=0;
        float x2=0;
        float x=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap a");
        a= scanner.nextInt();
        System.out.println("nhap b");
        b= scanner.nextInt();
        System.out.println("nhap c");
        c= scanner.nextInt();
        if (a!=0){
            delta=(b*b)-4*a*c;
            if (delta<0){
                System.out.println("phuong trinh vo nghiem");
            }
            if (delta==0){
                x1=x2=-b/2*a;
                System.out.println("phuong trinh co nghiem kep la: "+x1);
            }
            if (delta>0){
                x1=(-b+delta)/2*a;
                x2=(-b-delta)/2*a;
                System.out.println("phuong trinh co nghiem thu nhat la: "+x1);
                System.out.println("phuong trinh co nghiem thu 2 la: "+x2);
            }
        }else {
            if (b!=0){
                x=-c/b;
                System.out.println("phuong trinh co nghiem la:"+x);
            }
            if (b==0 && c==0){
                System.out.println(" phuong trinh vo so nghiem");
            }
            if (b==0 && c!=0){
                System.out.println(" phuong trinh vo nghiem");
            }
        }
    }
}