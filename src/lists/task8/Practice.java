package lists.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Spirited Away", 8.6, 2001));
        movies.add(new Movie("Shutter Island", 8.2, 2010));

        System.out.println("До сортировки");
        System.out.println(movies);

        ByRatingComparator byRatingComparator = new ByRatingComparator();

        movies.sort(byRatingComparator);
        System.out.println("После сортировки по рейтингу");
        System.out.println(movies);

        ByYearComparator byYearComparator = new ByYearComparator();
        movies.sort(byYearComparator);

        System.out.println("После сортировки по году выпуска");
        System.out.println(movies);
    }
}
