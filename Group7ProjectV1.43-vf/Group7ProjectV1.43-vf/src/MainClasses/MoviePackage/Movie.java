package MainClasses.MoviePackage;

import Panels.ReportPackage.SeasonalFrame;
import java.io.File;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Movie implements Serializable{
    
    private String movieName;
    private int price;  
    private String subtitles;
    private String description;
    private String director;
    private String producer;
    private Duration movieDuration;
    private LocalDateTime availableFromDate;    //
    private LocalDateTime expiryDate;   //
    private String moviePoster;
    private boolean isAvailable;
    private Season movieSeason;
    private int saleCounter;
    private String cast;
    private ArrayList<Screening> screenings;    //~
    private boolean[] merch;   //t-shirt and mug
    private ArrayList<Genre> genre;
    
//    void setInfo(){}
//    void getInfo(){}
//    void addToLibrary(){}
//    boolean checkAvailability(){}

    public Movie(String movieName, int price, String subtitles, String description, String director,
            String producer, Duration movieDuration, String moviePoster, LocalDateTime expiryDate,
            String cast, boolean[] merch, ArrayList<Genre> genre) {
        
        this.movieName = movieName;
        this.price = price;
        this.subtitles = subtitles;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.movieDuration = movieDuration;
        this.moviePoster = moviePoster;
        this.movieSeason = getMovieSeason();
        this.cast = cast;
        this.merch = merch;
        this.expiryDate = expiryDate;
        this.availableFromDate = null;
        this.screenings = null;
        this.saleCounter = 0;
        this.isAvailable = false;
        this.genre = genre;
//        if (genre.== 3) {
//            
//        } else {
//            JOptionPane.showMessageDialog(null, "Invalid input(s)! Cannot Add Movie to Library."
//                    , "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }

    public Movie() {
        
    }

    private Season getMovieSeason() {
        Season s;
        int month = LocalDateTime.now().getMonthValue();
        switch(month){
            case 11:
            case 12:
            case 1:
                s = Season.WINTER;
                break;
            case 2:
            case 3:
            case 4:
                s = Season.SPRING;
                break;
            case 5:
            case 6:
            case 7:
                s = Season.SUMMER;
                break;
            case 8:
            case 9:
            case 10:
                s = Season.AUTUMN;
                break;
            default:
                s = null;
        }
        return s;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getCast() {
        return cast;
    }

    public String getProducer() {
        return producer;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public boolean isAvailableNow() {
        return isAvailable;
    }

    public String getSubtitles() {
        return subtitles;
    }

    public String getDirectors() {
        return director;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return movieName;
    }

    

}
