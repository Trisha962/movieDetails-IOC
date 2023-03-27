package org.example;

import org.example.Movie.Movie;
import org.example.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);

       Movie obj1=(Movie) applicationContext.getBean("movie");
        System.out.println(obj1);

    }
}
