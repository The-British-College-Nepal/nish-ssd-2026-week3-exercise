package stats;

import java.util.Arrays;

/**
 * Calculates statistical metrics from a dynamic collection of integer values.
 *
 * @author Nish Adhikari
 */
public class Stats {

    private int[] numbers;
    private int count;

    /**
     * Creates a new Stats object that can hold a fixed number of values.
     *
     * @param capacity the maximum number of values that can be stored
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }

    /**
     * Adds a value to the collection.
     *
     * @param value the integer to append
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    /**
     * Returns how many values have actually been added.
     *
     * @return the number of values added, not the array capacity
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Finds the highest value that has been added.
     *
     * @return the maximum value
     * @throws IllegalStateException if no values have been added
     */
    public int getMax() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics.");
        }
        int max = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * Finds the lowest value that has been added.
     *
     * @return the minimum value
     * @throws IllegalStateException if no values have been added
     */
    public int getMin() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics.");
        }
        int min = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * Sums all the values that have been added.
     *
     * @return the total of all added values, or 0 if none have been added
     */
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Calculates the average of the values that have been added.
     *
     * @return the average as a double
     * @throws IllegalStateException if no values have been added
     */
    public double getAverage() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics.");
        }
        return getTotal() / (double) count;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}