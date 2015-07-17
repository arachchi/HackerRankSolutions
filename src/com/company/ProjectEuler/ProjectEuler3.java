package com.company.ProjectEuler;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProjectEuler3 {
    private static long iterator=0;
    private static long val =2;
    private static ArrayList<Long> primes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long T = scanner.nextLong();
        double start = System.nanoTime();

        for(long i=0;i<T;i++){
            Long test = scanner.nextLong();
            System.out.println(test);
            long largestPrime=1;
            for(long j= 2;j<Math.sqrt(test);j++){
                System.out.println(isPrime((int)j));
                if(isPrime((int)j)){
                    getPrimes().add(j);
                    System.out.println(j);
                    if(largestPrime<j){
                        largestPrime = j;
                    }
                }

            }


            System.out.println(largestPrime);
        }
        double end = System.nanoTime();
        //System.out.println((end - start)/1000000000);
    }

    /*
    * Return the next iterator in the Fib Sequence
    * */
    public static Long nextVal(){
        iterator ++;
        if(getIterator() < getPrimes().size()){
            setVal(getPrimes().get((int)getIterator()));
            return getVal();
        }else {
            val ++;
            return getVal();
        }
    }

    public static long getIterator() {
        return iterator;
    }

    public static void setIterator(long iterator) {
        iterator = iterator;
    }

    public static long getVal() {
        return val;
    }

    public static void setVal(long value) {
        val = value;
    }

    public static ArrayList<Long> getPrimes() {
        if(primes == null)
            primes = new ArrayList<Long>();

        return primes;
    }

    public static void setPrimes(ArrayList<Long> primes) {
        primes = primes;
    }

    public static boolean  isPrime(int n){

        Prime prime =new Prime();
        Random randomGenerator = new Random();

        prime=getValue(n-1,prime);
        Integer randomInteger = randomGenerator.nextInt(n-2) + 1;

        if(Math.pow(randomInteger,prime.getQ())%n ==1){
            return true;
        }

        for(int j=0;j<prime.getK();j++){
            if((Math.pow(randomInteger,Math.pow(2,j)*prime.getQ()))%n == (n-1)){
                return true;
            }
        }

        return false;
    }

    public  static Prime getValue(Integer n , Prime prime){//provide n-1 from the test to this function
        if(n%2 == 0){
            prime.incK();
            return getValue(n/2,prime);
        }
        else{
            prime.setQ(n);
            return prime;
        }
    }

    private static class Prime{
        Integer k,q;

        public Integer getK() {
            if(k==null)
                return k=0;
            else
                return k;
        }

        public void setK(Integer k) {
            this.k = k;
        }

        public Integer getQ() {
            if(q==null)
                return q=0;
            else
                return q;
        }

        public void setQ(Integer q) {
            this.q = q;
        }
        public void incK(){
            setK(getK() +1);
        }

    }
}
