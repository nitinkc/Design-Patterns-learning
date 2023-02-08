package com.deisgnpatterns.p5laziness;

public class Laziness {

    public static void main(String[] args) {
        int value = 4;

        //Eager Evaluation, compute is called and stored in temp, even though temp is not evaluated in if statement
        //int temp = compute(value);
        Lazy<Integer> temp = new Lazy(() -> compute(value));//lazy evaluation
        //Lazy<Integer> temp = new Lazy(compute(value));//This is also Eager evaluation


        //if(value > 4 && compute(value) > 100) {//Due to short circuiting, compute is never called
        //if(value > 4 && temp > 100) {
        if(value > 4 && temp.get() > 100) {
            System.out.println("path 1 with " + temp);
        } else {
            System.out.println("path 2");
        }
    }

    public static int compute(int number) {
        //imagine takes some time to compute
        System.out.println("compute called...");
        return number * 100;
    }
}
