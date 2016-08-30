/**
 * Created by halleyfroeb on 8/29/16.
 * Stores information about Movie title, rating, and ticket sales
 */
public class Movie {
    char movieRating;
    String[] actors;
    //= {"Tom Hanks", "Forrest", "Bubba Gump", "Louisiana"}; The Array
    int ticketSales;
    String title;

    public Movie(char movieRating, String[] actors, int ticketSales, String title) {
        this.movieRating = movieRating;
        this.actors = actors;
        this.ticketSales = ticketSales;
        this.title = title;

    }

    public int countTicketSales(int ticketSales) {
        if (ticketSales > 0) {
            return ticketSales;
        }
        return 0;
    }

    public char getMovieRating(char movieRating) {
        return movieRating;
    }

    public void setMovieRating(char movieRating) {
        this.movieRating = movieRating;
    }

    public String getActors(String actors) {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public void setTicketSales(int ticketSales) {
        this.ticketSales = ticketSales;
    }

    public String getTitle (String title) {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }
}
