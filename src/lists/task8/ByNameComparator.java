package lists.task8;

import java.util.Comparator;

public class ByNameComparator implements Comparator<Movie > {
    @Override
    public int compare(Movie o1, Movie o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getTitle(), o2.getTitle());
    }
}
