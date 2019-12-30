public class SquareRoot {
    private int input;
    // a positive integer <=10,000

    public static boolean checkPerfectSquare(int input){
        int min = 0;
        int max = 101;
        int mid = 50;
        while (max != mid && min != mid){
            if (mid*mid == input){
                return true;
            } else if (mid*mid > input){
                max = mid;
            } else if (mid*mid < input){
                min = mid;
            }
            mid = min + (max-min)/2;
        }
        return false;
    }

}
