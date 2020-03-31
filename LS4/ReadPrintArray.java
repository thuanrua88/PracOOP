package LS4;

import java.util.Scanner;

public class ReadPrintArray {
    public static void main(String[] args) {
        int numItems;
        int[] items;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of iteams: ");
        numItems = input.nextInt();
        items = new int[numItems];
        if (items.length > 0){
            System.out.print("enter the value of all items (separated by space) : ");
            for (int i = 0; i < items.length; i++){
                items[i] = input.nextInt();
            }
        }
//        System.out.print("The values are: [");
//        for (int i = 0; i < items.length; i++){
//            if (i == 0) {
//                System.out.print(items[0]);
//            } else {
//                System.out.print(", " + items[i]);
//            }
//        }
//        System.out.println("]");

        for (int iteam : items){
            System.out.print(iteam);
        }
        input.close();
    }
}
