package lists.task8;

import java.util.Comparator;

public class ByYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
