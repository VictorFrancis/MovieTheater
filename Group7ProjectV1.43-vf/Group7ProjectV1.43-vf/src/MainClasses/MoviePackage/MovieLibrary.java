
package MainClasses.MoviePackage;

import MainClasses.MoviePackage.Movie;
import java.io.File;
import java.util.ArrayList;


public class MovieLibrary {
    
    ArrayList <Movie> currentlyScreening;
    ArrayList <Movie> upcomingMovies;
    ArrayList <Movie> screenHistory;
    
//    void showMovieList(){}
//    void showUpcomingMovies(){}
//    void showCurrentlyScreened(){}
//    boolean CheckMovieAvailability(){}
//    void addMovie(){}
//    void addUpcomingMovie(){}
//    void setScreening(){}
//    void removeMovie(){}
//    void getMovieInfo(){}
//    void setSchedule(){}
//    void redirectToMovieInfo(){}
//    void sendMovieSalesRecord(){}

    public MovieLibrary() {
    }
    
    public MovieLibrary(ArrayList<Movie> currentlyScreening, ArrayList<Movie> upcomingMovies, ArrayList<Movie> screenHistory) {
        this.currentlyScreening = currentlyScreening;
        this.upcomingMovies = upcomingMovies;
        this.screenHistory = screenHistory;
    }

    public ArrayList<Movie> getCurrentlyScreeningList() {
        return this.currentlyScreening;
    }

    public ArrayList<Movie> getUpcomingList() {
        return this.upcomingMovies;
    }

    public ArrayList<Movie> getScreenHistoryList() {
        return this.screenHistory;
    }
    
    
    
    
}
