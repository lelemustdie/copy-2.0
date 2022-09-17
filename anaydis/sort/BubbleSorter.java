package anaydis.sort;

import java.util.Comparator;
import java.util.List;

public class BubbleSorter extends AbstractSorter {
    public BubbleSorter(){
        super(SorterType.BUBBLE);
    }
    @Override
    public <T> void sort(Comparator<T> comparator, List<T> a) {
        int N = a.size();
        for (int i = 0; i < N-1; i++) {
            for (int j = N-1; j > i; j--) {
                compExch(a, j-1, j, comparator);
            }
        }
    }
}
