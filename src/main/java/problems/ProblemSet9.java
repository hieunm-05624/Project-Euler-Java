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
public class ProblemSet9 {

    private int sum;

    public ProblemSet9(int sum) {
        this.sum = sum;
    }

    //explanation:
    //b = a;
    //if a, b (a <= b) and c are the Pythagorean triplet,
    //then b, a (b >= a) and c - also the solution, so we can search only one case
    //c = 1000 - a - b; It's one of the conditions of the problem (we don't need to scan all possible 'c': just calculate it)
    
    //If a < b and b < c, a can't be greater/equals than 1000/3 and b can't be greater/equals than 1000/2. 
    //And since a, b, c aren't used outside their loops, just declare them in the for-head
    
    public int calculatePythagorean() {
        for (int a = 1; a <= this.sum / 3; a++) {
            for (int b = a + 1; b <= sum / 2; b++) {
                int c = this.sum - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }
}
