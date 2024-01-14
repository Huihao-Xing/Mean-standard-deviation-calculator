/**
 * This class will defined major program for calculating Mean and stdDev.
 *
 * @author Huihao Xing
 * @version 10/10/2023
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StatDriver {
    public static void main(String[] args) {
        ArrayList <Double> data = new ArrayList<Double>();

        Scanner input = new Scanner(System.in);
        while (input.hasNextDouble()) {
            data.add(input.nextDouble());
        }
        if (args.length > 0 && args[0].equals("std")) {
            double stdDev = Stats.stdDev(data);
            System.out.printf("StdDev: %.2f%n", stdDev);
        } else {
            double mean = Stats.mean(data);
            System.out.printf("Mean: %.2f%n", mean);

        }

    }
}