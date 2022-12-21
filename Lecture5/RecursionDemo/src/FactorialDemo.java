public class FactorialDemo {
    public static void main(String[] args) {
        long num = 4;
        long result = CalcFactorial(num);
        System.out.printf("Factorial " + num + " is " + result);
    }

    // recursion is
    static long CalcFactorial(long number){
        if(number == 1) return 1;
        return number * CalcFactorial(number - 1);
    }
}
