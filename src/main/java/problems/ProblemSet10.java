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
public class ProblemSet10 extends ProblemSet7 {

    public ProblemSet10(int limit) {
        super(limit);
    }

    public long calculateSum() {
        long primeNumber = 0;
        for (int i = 2; i <= this.getLimit(); i++) {
            if (this.isPrimeNumber(i)) {
                primeNumber += i;
            }
        }
        return primeNumber;
    }

}
