/**
 * Name: Manu Achar
 * Class: Recursion
 * Description: Recursion part 1 HW
 */

public class RecursionPractice {

    public String displayString(String str, int n){
        if (n == 1){
            return str;
        }
        return str + displayString(str, n - 1);
    }

    public String getMultiChar(char ch, int n){
        if (n == 0){
            return Character.toString(ch);
        }
        return Character.toString(ch) + getMultiChar(ch, n - 1);
    }

    public long getPowerOfTen(int n){
        if (n == 0){
            return 1;
        }
        return 10 * getPowerOfTen(n - 1);
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else return n * factorial(n - 1);
    }

    public int numberOfGloves(int peopleOfPlanetU101InARoom){
        if (peopleOfPlanetU101InARoom == 0) {
            return 0;
        } else if (peopleOfPlanetU101InARoom == 1) {
            return 3;
        }
        return 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
    }

    public long getPowerOfTenLoops(int n){
        long number = 1;
        for (int i = 0; i < n - 1; i++) {
            number *= 10;
        }
        return number;
    }

    public int numberOfGlovesLoops(int peopleOfPlanetU101InARoom){
        int gloves = 0;
        for (int i = 0; i < peopleOfPlanetU101InARoom; i++) {
            gloves += 3;
        }
        return gloves;
    }

    public int getNumberOfZerosLoop(int n){
        int count = 0;
        // to find the length of the integer for the for loop.
        int length = Integer.toString(n).length();

        for (int i = 0; i < length; i++){
            if (n % 10 == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    public int getNumberOfZerosRecursion(int n){
        if (n / 10 == 0){
            return 0;
        } else if (n % 10 == 0) {
            return 1 + getNumberOfZerosRecursion(n / 10);
        }
        return getNumberOfZerosRecursion(n / 10);
    }
