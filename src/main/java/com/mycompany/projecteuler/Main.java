/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projecteuler;

import java.util.ArrayList;
import problems.ProblemSet1;
import problems.ProblemSet10;
import problems.ProblemSet2;
import problems.ProblemSet3;
import problems.ProblemSet4;
import problems.ProblemSet5;
import problems.ProblemSet6;
import problems.ProblemSet7;
import problems.ProblemSet8;
import problems.ProblemSet9;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        // Problem 1
        ProblemSet1 problemSet1 = new ProblemSet1(3, 5, 1000);
        System.out.println("Problem Set 1: " + problemSet1.multiplesOfTwoNumber());

        // Problem 2
        ProblemSet2 problemSet2 = new ProblemSet2(4000000);
        System.out.println("Problem Set 2: " + problemSet2.calFibonaciSumOfEven());

        // Problem 3
        ProblemSet3 problemSet3 = new ProblemSet3(600851475143L);
        System.out.println("Problem Set 3: " + problemSet3.getPrimeFactorOfNumber());

        // Problem 4
        ProblemSet4 problemSet4 = new ProblemSet4();
        System.out.println("Problem Set 4: " + problemSet4.getPalindromicNumber(100, 999));

        // Problem 5
        ProblemSet5 problemSet5 = new ProblemSet5(11, 20);
        System.out.println("Problem Set 5: " + problemSet5.getSmallestPositiveNumber());

        // Problem 6
        ProblemSet6 problemSet6 = new ProblemSet6(100, 2);
        System.out.println("Problem Set 6: " + problemSet6.getDifference());

        // Problem 7
        ProblemSet7 problemSet7 = new ProblemSet7(10001);
        System.out.println("Problem Set 7: " + problemSet7.getPrimeNumber());

        // Problem 8
        ProblemSet8 problemSet8 = new ProblemSet8(13);
        System.out.println("Problem Set 8: " + problemSet8.getGreatestMul());

        // Problem 9
        ProblemSet9 problemSet9 = new ProblemSet9(1000);
        System.out.println("Problem Set 9: " + problemSet9.calculatePythagorean());
        
        // Problem 10
        ProblemSet10 problemSet10 = new ProblemSet10(2000000);
        System.out.println("Problem Set 10: " + problemSet10.calculateSum());
    }

}
