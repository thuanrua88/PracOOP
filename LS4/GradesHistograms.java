package LS4;

import java.util.Arrays;
import java.util.Scanner;

public class GradesHistograms {
    public static void main(String[] args) {
        int numStudents;
        int[] grades;
        int[] bins = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of students: ");
        numStudents = input.nextInt();
        grades = new int[numStudents];
        for (int i = 0; i < grades.length; ++i){
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(grades));
        for (int grade : grades){
            if (grade == 100){
                ++bins[9];
            } else {
                ++bins[grade/10];
            }
        }
        System.out.println(Arrays.toString(bins));
        for (int binIndex = 0; binIndex < bins.length; ++binIndex){
            if (binIndex != 9){
                System.out.printf("%2d-%3d: ", binIndex*10, binIndex*10+9);
            }else {
                System.out.printf("%2d-%3d: ", 90, 100);
            }
            for (int itemNo = 0; itemNo < bins[binIndex]; ++itemNo){
                System.out.print("*");
            }
            System.out.println();
        }
        int binMax = bins[0];
        for (int binIndex = 1; binIndex < bins.length; ++binIndex){
            if (binMax < bins[binIndex]) binMax = bins[binIndex];
        }
        for (int level = binMax; level > 0; --level){
            for (int binIdex = 0; binIdex < bins.length; ++binIdex){
                if (bins[binIdex] >= level) {
                    System.out.print("   *   ");
                }else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
        for (int binIndex = 0; binIndex < bins.length; ++binIndex){
            System.out.printf("%3d-%-3d", binIndex*10, (binIndex != 9) ? binIndex * 10 + 9 : 100);
        }
        System.out.println();
        input.close();
    }
}
