package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class HSorter extends AbstractSorter {

    public HSorter() {
        super(SorterType.H);
    }
    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(comparator, list, 1,0, list.size()-1);
    }


    public <T> void sort(Comparator<T> comparator, List<T> list, int h, int l, int r){
        for (int i = l+h; i <= r; i++) {
            T v = list.get(i);
            int j = i;
            while (j >= l+h && less(v, list.get(j-h),comparator)) {
                list.set(j, list.get(j-h));
                j -= h;
            }
            list.set(j,v);
        }
    }
}