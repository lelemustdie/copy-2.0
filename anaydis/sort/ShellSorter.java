package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

public class ShellSorter extends AbstractSorter{
    HSorter hSorter;
    public ShellSorter(){
        super(SorterType.SHELL);
        hSorter = new HSorter();
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(comparator,list,0, list.size()-1);
    }


    public <T> void sort(Comparator<T> comparator, List<T> list, int l, int r){
        int h;
        for (h = 1; h<=(r-l)/9;h = 3*h+1);
        for (;h>0;h/=3){
            hSorter.sort(comparator,list,h,l,r);
        }

    }

    public <T> void sort(Comparator<T> comparator, List<T> list,List<Integer> hList, int l, int r){
        for (int i = 0; i < hList.size(); i++) {
            hSorter.sort(comparator,list,hList.get(i),l,r);
        }
    }
}
