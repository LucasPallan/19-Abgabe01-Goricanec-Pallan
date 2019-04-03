package at.fhj.iit;
import java.util.*;

public class CalculatorImpl implements Calculator
{
    List<Integer> list = new ArrayList<>();

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < list.size(); ++i) {
            sum += list.get(i);
        }
        return sum;
    }

    @Override
    public int getMaximum() {

        int max = list.get(0);

        for (int i = 1; i < list.size(); ++i) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    @Override
    public int getMinimum() {
        return 0;
    }

    @Override
    public void addValue(int value) {
        list.add(value);
    }
}
