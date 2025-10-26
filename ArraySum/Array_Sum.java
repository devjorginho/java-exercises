public class Array_Sum {
    public static int sumThisVargs(int... numbers) {
        int result = 0;

        for(int number : numbers) {
            result += number;
        }
    return result;
    }

    public static int sumThisArray() {

        int[] numbers = {10, 20, 30, 40};
        int result = 0;

        for(int j : numbers)
            result += j;
        return result;
    }
}
