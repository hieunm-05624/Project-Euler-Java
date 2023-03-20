/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProblemSet3 {

    private long numb;

    public ProblemSet3(long numb) {
        this.numb = numb;
    }
    

    public long getPrimeFactorOfNumber() {
        long numb = this.numb;
        for (long i = 2; i < numb; i++) {
            while (numb % i == 0) {
                numb = numb / i;
            }
        }
        return numb;
    }

}
