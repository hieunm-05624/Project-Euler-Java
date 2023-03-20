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
public class ProblemSet5 {

    private int min;
    private int max;

    public ProblemSet5(int min, int max) {
        this.min = min;
        this.max = max;
    }

    //2520 is the smallest number that can be 
    //divided by each of the numbers from 1 to 10 without any remainder.
    public int getSmallestPositiveNumber() {
        int numb = 2520;
        while (true) {
            boolean dividable = true;
            numb += 2520;
            for (int i = this.min; i <= this.max; i++) {
                if (numb % i != 0) {
                    dividable = false;
                    break;
                }
            }
            if (dividable) {
                break;
            }

        }

        return numb;
    }

}
