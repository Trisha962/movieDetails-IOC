package org.example.Movie;

public class Movie {
    private String movieName;
    private int movieId;
    private String movieRating;

    public Movie(){}

    public Movie(String movieName, int movieId, String movieRating) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieId=" + movieId +
                ", movieRating='" + movieRating + '\'' +
                '}';
    }
}
