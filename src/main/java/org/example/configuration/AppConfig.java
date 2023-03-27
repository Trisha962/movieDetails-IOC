package org.example.configuration;

import org.example.Movie.Movie;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("movie")
    public Movie getDetails(){
        return new Movie("Shutter Island",1,"9.8");
    }
}
