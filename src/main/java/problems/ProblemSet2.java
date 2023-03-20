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
public class ProblemSet2 {

    private int limit;

    public ProblemSet2(int limit) {
        this.limit = limit;
    }

    public int calFibonaciSumOfEven() {
        ArrayList<Integer> fibo = new ArrayList<>();
        int sum = 0;

        for (int i = 0; true; i++) {

            int first = i - 1 >= 0 ? i - 1 : 0;
            int second = i - 2 >= 0 ? i - 2 : 0;

            int getFirstIndexValue = fibo.size() > first ? fibo.get(first) : 1;
            int getSecondIndexValue = fibo.size() > second ? fibo.get(second) : 0;
            
            int newValue = getFirstIndexValue + getSecondIndexValue;
            fibo.add(newValue);
            if (newValue >= this.limit) {
                break;
            }
            if (newValue % 2 == 0) {
                sum += newValue;
            }

        }

        return sum;

    }
}
