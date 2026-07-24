/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int milf = left + (right - left) / 2;

            int result = guess(milf);

            if (result == 0) {
                return milf;
            } else if (result == -1) {
                right = milf - 1;
            } else {
                left = milf + 1;
            }
        }

        return -1;
    }
}