package lists.task8;

public class Movie {
    private final String title;
    private final double rating;
    private final int year;

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

