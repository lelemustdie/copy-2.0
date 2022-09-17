package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortProvider implements SorterProvider {

    Iterable<Sorter> sorters = new ArrayList<Sorter>(Arrays.asList(new BubbleSorter(), new InsertionSorter(), new SelectionSorter(), new QuickSorter(), new ShellSorter(), new HSorter()));

    @NotNull
    @Override
    public Iterable<Sorter> getAllSorters() {
        return sorters;
    }

    @NotNull
    @Override
    public Sorter getSorterForType(@NotNull SorterType type) {
        for (Sorter typesorter:sorters) {
            if(typesorter.getType()==type){
                return typesorter;
            }

        }
        throw new IllegalArgumentException();

    }
}


