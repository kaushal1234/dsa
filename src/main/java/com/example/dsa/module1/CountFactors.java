package com.example.dsa.module1;

public class CountFactors {
    public static void main(String[] args) {
        int N=15;
        int numOfFactors = countFactors(N);
        System.out.println("Number of fators ==> " + numOfFactors + ", Of N ==> " + N);
    }

    static int countFactors(int N) {
        int count=0;
        for(int i=1; i<=N; i++) {
            if(N%i == 0)
                count++;
        }
        return count;
    }
}
