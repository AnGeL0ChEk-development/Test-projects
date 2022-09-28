import java.util.Scanner;
import java.lang.*;


public class calc {
    public static void main(String[] args) {
        System.out.print("Выберите что надо зделать +(1) -(2) /(3) *(4): ");


        Scanner question = new Scanner(System.in);
        int sol = question.nextInt();

        System.out.println("Enter a:");
        Scanner solb = new Scanner(System.in);
        int bm = solb.nextInt();

        System.out.println("Enter b:");
        Scanner sola = new Scanner(System.in);
        int am = sola.nextInt();



        if (sol == 1){
            plus(am,bm);
        }
        if (sol == 2){
            minus(am,bm);
        }
        if (sol == 3){
            divide(am,bm);
        }
        if (sol == 4){
            multiply(am,bm);
        }

    }

    public static void plus(int a, int b){
        int solplus = a + b;
        System.out.println("A + b = " + solplus);
    }
    public static void minus(int a, int b){
        int solminus = a - b;
        System.out.println("A + b = " + solminus);
    }
    public static void multiply(int a, int b){
        int solmultip = a * b;
        System.out.println("A + b = " + solmultip);
    }
    public static void divide(int a, int b){
        int soldiv = a / b;
        System.out.println("A + b = " + soldiv);
    }


}


