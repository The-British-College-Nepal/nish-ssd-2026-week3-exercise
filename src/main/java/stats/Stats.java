package stats;

import java.util.Arrays;

// TODO [Step 3.1]: Add class-level Javadoc with @author tag
public class Stats {

    private int[] numbers;
    private int count;

    // TODO [Step 3.2]: Add Javadoc with @param capacity
    public Stats(int capacity) {
        numbers = new int[capacity];
    }

    // TODO [Step 3.3]: Add Javadoc with @param value
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    // TODO [Step 3.4]: Add Javadoc with @return
    public int getCount() {
        return this.count;
    }

    // TODO [Step 3.5]: Throw IllegalStateException if count == 0 ("No values have been added")
    public int getMax() {
        int max = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // TODO [Step 3.6]: Throw IllegalStateException if count == 0 ("No values have been added")
    public int getMin() {
        int min = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // TODO [Step 3.7]: Add Javadoc with @return
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    // TODO [Step 3.8]: Throw IllegalStateException if count == 0 ("No values have been added")
    public double getAverage() {
        return getTotal() / (double) count;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}