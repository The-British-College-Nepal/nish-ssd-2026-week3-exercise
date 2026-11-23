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

    // TODO [Step 2.1]: Loop up to count (NOT numbers.length) to find highest value
    // TODO [Step 3.5]: Throw IllegalStateException if count == 0
    public int getMax() {
        return 0;
    }

    // TODO [Step 2.2]: Loop up to count (NOT numbers.length) to find lowest value
    // TODO [Step 3.6]: Throw IllegalStateException if count == 0
    public int getMin() {
        return 0;
    }

    // TODO [Step 2.3]: Sum all added values (loop up to count)
    // TODO [Step 3.7]: Add Javadoc with @return
    public int getTotal() {
        return 0;
    }

    // TODO [Step 2.4]: Divide total by count as a double
    // TODO [Step 3.8]: Throw IllegalStateException if count == 0
    public double getAverage() {
        return 0.0;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}