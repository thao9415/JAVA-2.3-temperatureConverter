import java.util.Scanner;

public class TemperatureConverter {
    public static double fToC(double f) {
        double c=(5.0/9)*(f-32);
        return c;
    }
    public static double cTof(double c){
        double f=(9.0/5)*c+32;
        return f;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double f;
        double c;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.print("F = ");
                    f=input.nextDouble();
                    c=fToC(f);
                    System.out.println("C = "+c);
                    break;
                case 2:
                    System.out.print("C = ");
                    c=input.nextDouble();
                    f=fToC(c);
                    System.out.println("F = "+f);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice!=0);

    }
}
