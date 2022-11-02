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
}
