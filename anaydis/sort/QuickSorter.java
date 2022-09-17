package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class QuickSorter extends AbstractSorter {

    public QuickSorter() {
        super(SorterType.QUICK);
    }
    public <T> void sort(Comparator<T> a, int lo, int hi, List <T> list) {
        if(hi <= lo) return;
        int i = partition(a, lo, hi, list);
        sort(a, lo, i - 1,list);
        sort(a, i + 1, hi, list);
    }


    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(comparator,0, list.size()-1, list);

    }
}
