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
public class ProblemSet7 {

    private int limit;

    public ProblemSet7(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    

    public boolean isPrimeNumber(int num) {
        boolean flag = false;
        // a number is not divisible by more than its half
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        return !flag;
    }

    public int getPrimeNumber() {
        int count = 0;
        int primeNumber = 0;
        for (int i = 2; true; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
            if (count == this.limit) {
                primeNumber = i;
                break;
            }
        }
        return primeNumber;
    }

}
