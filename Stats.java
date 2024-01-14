/**
 * This class will defined major method for calculating Mean and stdDev.
 *
 * @author Huihao Xing
 * @version 10/10/2023
 */
import java.util.ArrayList;


public class Stats {
    public static double mean(ArrayList<Double> value) {
        if (value.isEmpty() || value.size() == 0) {
            return Double.NaN;
        }
        double sum = 0;
        for (int i = 0; i < value.size(); i++) {
            sum = Double.sum(value.get(i), sum);
        }
        return sum / value.size();

    }

    public static double stdDev(ArrayList <Double> value) {
        if (value.isEmpty() || value.size() == 0) {
            return Double.NaN;
        }

        double difference = 0;
        double SumOfSquare = 0;
        double SumSquareDivideSize = 0;
        double average = mean(value);

        for (int i = 0; i < value.size(); i++) {
            difference = (value.get(i) - average);
            SumOfSquare += difference * difference;
        }
        SumSquareDivideSize = SumOfSquare / value.size();
        return Math.sqrt(SumSquareDivideSize);
    }
}