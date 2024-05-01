public class Operators {

    static void addASCI(){
        System.out.println('a'+ 'b');
    }

    static void one(){
        System.out.println("New\thouse\nOld\thouse");
    }

    static void two(){
        System.out.println("Hello\t!\"World\"");
    }

    static void three(){
        int a =10;

        System.out.println(a);
    }

    static void addSuffix(){
        float value = 10.09787898454545f;
        long secondValue=  78794646464877878L;
        System.out.println(value + " "+ secondValue);

    }

    static void ternaryOperator(){
        int a = (55%10==0)? 10: 5;
        System.out.println(a);
    }
    public static void main(String[] args){
        int firstValue = 5;
        int secondValue = 6;
        System.out.println(firstValue+secondValue);
        addASCI();
        one();
        two();
        three();
        addSuffix();
        ternaryOperator();
    }
}
