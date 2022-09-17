package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class InsertionSorter extends AbstractSorter {

    public InsertionSorter() {
        super(SorterType.INSERTION);
    }

    @Override
    public <T> void sort (Comparator<T> comparator, List <T> a) {

        int N = a.size();
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a.get(j), a.get(j-1),comparator)) {
                    exch(a, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
