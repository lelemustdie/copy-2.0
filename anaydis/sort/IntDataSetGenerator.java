package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class IntDataSetGenerator implements DataSetGenerator<Integer> {

    @NotNull
    @Override
    public List<Integer> createAscending(int length) {
        List<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            aList.add(i, i);
        }

        return aList;
    }

    @NotNull
    @Override
    public List<Integer> createDescending(int length) {
        int begin = length;
        List<Integer> descendingAList = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            descendingAList.add(i, begin);
            begin--;
        }
        return descendingAList;
    }

    @NotNull
    @Override
    public List<Integer> createRandom(int length) {
        List<Integer> randomAList = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            randomAList.add(i, new Random().nextInt());
        }

        return randomAList;
    }

    @NotNull
    @Override
    public Comparator<Integer> getComparator() {
        return Comparator.naturalOrder();
    }
}


