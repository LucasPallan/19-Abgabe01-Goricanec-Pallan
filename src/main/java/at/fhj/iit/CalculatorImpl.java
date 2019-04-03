package at.fhj.iit;

import java.util.*;

public class CalculatorImpl implements Calculator
{
    List<Integer> list = new ArrayList<>();

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return sum;
    }

    @Override
    public int getMaximum() {
        return 0;
    }

    @Override
    public int getMinimum() {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++)
        {
            if (min > list.get(i))
            {
                min = list.get(i);
            }
        }
        return min;

    }

    @Override
    public void addValue(int value) {
        list.add(value);
    }
}
