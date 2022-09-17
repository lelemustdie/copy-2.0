package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Abstract sorter: all sorter implementations should subclass this class.
 */

abstract class AbstractSorter implements Sorter {
    SorterType type;
    public AbstractSorter(SorterType type) {
        this.type = type;
    }
    public <T> boolean  less(T v, T w, Comparator<T> comp) {

        return comp.compare(v,w) < 0;
    }
    public <T> void exch(List<T> a, int i, int j) { //objetos de los index
        T t = a.get(i);
        a.set(i, a.get(j));
        a.set(j,t);
    }
    public <T> void compExch(List<T> a, int i, int j, Comparator<T> comp) { //less n exch
        if (less(a.get(j), a.get(i), comp))
            exch (a, i, j);
    }
    @NotNull
    @Override
    public SorterType getType() {
        return type;
    }
    public <T> int partition (Comparator<T> comparator , int lo, int hi, List<T> a) {
        int i = lo - 1;
        int j = hi;
        while(true) {
            while( less(a.get(++i), a.get(hi), comparator) )
                if (i == hi) break;
            while( less(a.get(hi), a.get(--j), comparator) )
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, i, hi);
        return i;
    }

}
