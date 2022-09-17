package anaydis.sort;

import java.util.Comparator;
import java.util.List;

public class SelectionSorter extends AbstractSorter {

    public SelectionSorter() {

        super(SorterType.SELECTION); //enums
    }

    public <T >void sort(Comparator<T> comparator, List<T> list) {

        int N = list.size();
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(list.get(j), list.get(min), comparator)) {
                    min = j;
                }
            }
            exch(list, i, min);
        }
    }
}