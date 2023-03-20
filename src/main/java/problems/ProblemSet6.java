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
public class ProblemSet6 {

    private int limit;
    private int square;

    public ProblemSet6(int limit, int square) {
        this.limit = limit;
        this.square = square;
    }

    private int getSumOfSquares() {
        int sum = 0;
        for (int i = 0; i <= this.limit; i++) {
            sum += Math.pow(i, this.square);
        }
        return sum;
    }

    private int getSquaresOfSum() {
        int sum = 0;
        for (int i = 0; i <= this.limit; i++) {
            sum += i;
        }
        int square = (int) Math.pow(sum, this.square);
        return square;
    }

    public int getDifference() {
        int sumOfSquares = getSumOfSquares();
        int squaresOfSum = getSquaresOfSum();
        int result = squaresOfSum - sumOfSquares;
        return result;
    }
}
