package LS4;

public class forEach {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 6, 4, 3};
        int sum = 0, sumSQ = 0;
        for (int number : numbers){
            sum += number;
            sumSQ += number * number;
        }
        System.out.println("The sum is : " + sum);
        System.out.println("The square sum is : " + sumSQ);
    }
}
