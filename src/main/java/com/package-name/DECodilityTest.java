package com.kafka.trial.kafkatrial;

import java.util.ArrayList;
import java.util.List;

public class DECodilityTest {

    public static void main(String[] args) {
        System.out.println("Start!");

        /*
        int[][] A = new int[3][3];
        A[0][0]=1;
        A[0][1]=2;
        A[0][2]=3;
        A[1][0]=4;
        A[1][1]=5;
        A[1][2]=6;
        A[2][0]=7;
        A[2][1]=8;
        A[2][2]=9;
        */

        int[][] A = new int[2][3];
        A[0][0]=1;
        A[0][1]=2;
        A[0][2]=14;
        A[1][0]=8;
        A[1][1]=3;
        A[1][2]=15;

        /*
        int[][] A = new int[2][2];
        A[0][0]=1;
        A[0][1]=4;
        A[1][0]=2;
        A[1][1]=3;
        */


        /*
        int[][] A = new int[3][2];
        A[0][0]=12;
        A[0][1]=12;
        A[1][0]=12;
        A[1][1]=12;
        A[2][0]=0;
        A[2][1]=7;
        */

        /*
        int[][] A = new int[3][3];
        A[0][0]=15;
        A[0][1]=1;
        A[0][2]=5;
        A[1][0]=16;
        A[1][1]=3;
        A[1][2]=8;
        A[2][0]=2;
        A[2][1]=6;
        A[2][2]=4;
        */

        int result = solution(A);
        System.out.println("Result is " + result);


    }

    private static void solutionString(String str) {
        int bCount = 0;
        int nCount = 0;
        int aCount = 0;

        for(int i=0; i<str.length(); i++) {
            if('B' == str.charAt(i)) {
                bCount++;
            } else if('N' == str.charAt(i)) {
                nCount++;
            } else if('A' == str.charAt(i)) {
                aCount++;
            }
        }
        System.out.println("Counts of B N and A are " + bCount + " " + nCount + " " + aCount);
    }

    private static int solution(int[][] A) {
        int maximumSum = 0;
        int rows = A.length;
        int cols= A[0].length;
        System.out.println("Rows " + rows);
        System.out.println("Cols " + cols);

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.println("For " + i + " " + j + " " + A[i][j]);
                int maximumNonRowAndNonColumnNumberForAMaxtrixValue = getNonRowAndNonColumn(A, rows, cols, i, j);
                if(A[i][j] + maximumNonRowAndNonColumnNumberForAMaxtrixValue > maximumSum) {
                    maximumSum = A[i][j] + maximumNonRowAndNonColumnNumberForAMaxtrixValue;
                }
                System.out.println("Max sum " + maximumSum);
            }
        }
        return maximumSum;
    }

    private static int getNonRowAndNonColumn(int[][] A, int rows, int cols, int x, int y) {
        int maximumNumber = 0;
        for(int i=x+1; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.println("Looping " + i + " " + j);
                if(x!=i && y!=j) {
                    if(A[i][j]>maximumNumber) {
                        maximumNumber = A[i][j];
                    }
                }
            }
        }
        System.out.println("Max num " + maximumNumber);
        return maximumNumber;
    }

}
