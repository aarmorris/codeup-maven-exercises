public class MathOperations {
// These are methods down below:
    public static long add(long input1, long input2){
        return input1 + input2;
    }

    public static double tip(double bill, double tip){
        return bill * (tip/100);
    }

    public static int[] addOneToArray (int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] +=1;


        }
        return numbers;
    }
              // CODE-EXERCISES EASY PROBLEM DOWN BELOW
    public static int practiceSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

//    public static int practiceFactorial(int n){
//        int count = 1;
//        int acc = 1;
//        for (int i = n; i > 1; i--, n--){
//            System.out.printf("%s = ( %s * %s )%n", count, i, n-1);
//            count = i * (n-1);
//            acc *= count;
//            System.out.println(acc);
//
//        }
//        return acc;
//    }

    public static int practiceFactorial(int n){
        int fact = n;
        for (int j = n-1; j > 0; j--){
            fact *= j;
        }
        return fact;
    }

//    public static int fact(int n) {
//        int acc = 1;
//        for (int i =1; i < n; i++){
//            acc *= i;
//        }
//        System.out.println(acc);
//        return acc;
//    }



    public static void main(String[] args) {
//        System.out.println(practiceFactorial(5));
        System.out.println(practiceFactorial(5));
    }
}
