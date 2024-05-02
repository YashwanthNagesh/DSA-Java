import java.util.Scanner;

public class Basics1 {


    static void order(){
        System.out.println(5+1+"String"+5*5);
    }

    static void getInput(){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        System.out.println(value);
    }

    static void typeCasting(){
        int value = 100;
        long secondValue = value;
        System.out.println(secondValue);
        int firstValue = (int) secondValue;
        System.out.println(firstValue);
    }
    public static void main(String[] args){
        System.out.print(100);
        System.out.print(50);
        System.out.println(80);
        System.out.print(60);
        int _y = 70;
        System.out.println(_y);
        order();
        getInput();
        typeCasting();
    }
}
