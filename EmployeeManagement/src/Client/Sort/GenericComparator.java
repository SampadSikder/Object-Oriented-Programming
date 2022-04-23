package Client.Sort;

import java.util.Comparator;

public class GenericComparator<T extends Comparable<T>> implements Comparator<T> {
    public int compare(T a, T b){
        return a.compareTo(b);
    }
}
