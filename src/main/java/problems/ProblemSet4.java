/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author Admin
 */
public class ProblemSet4 {

    public ProblemSet4() {
    }

    private boolean checkIsPalindromicNumber(int number) {
        String numbConvert = String.valueOf(number);
        String revertNumb = new StringBuilder(numbConvert).reverse().toString();
        if (numbConvert.equals(revertNumb)) {
            return true;
        }
        return false;
    }

    public int getPalindromicNumber(int min, int max) {
        int maxNumber = 0;
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                int mul = i * j;
                if (checkIsPalindromicNumber(mul)) {
                    maxNumber = mul > maxNumber ? mul : maxNumber;
                }
            }
        }
        return maxNumber;
    }

}
