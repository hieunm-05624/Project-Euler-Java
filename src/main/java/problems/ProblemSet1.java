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
public class ProblemSet1 {

    private int firstNumb;
    private int secondNumb;
    private int limit;

    public ProblemSet1(int firstNumb, int secondNumb, int limit) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
        this.limit = limit;
    }

    public int multiplesOfTwoNumber() {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (i % this.firstNumb == 0 || i % this.secondNumb == 0) {
                sum += i;
            }
        }
        return sum;

    }

}
