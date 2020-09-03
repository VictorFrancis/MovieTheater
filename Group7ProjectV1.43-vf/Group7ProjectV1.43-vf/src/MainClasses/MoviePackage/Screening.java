package MainClasses.MoviePackage;

import java.sql.Time;
import java.time.LocalDateTime;

public class Screening {
    
    private Theatre theatre;
    private LocalDateTime startingTime;
    private LocalDateTime endingTime;
    
    
    

//    String getTheatreLabel(){}
//    String getMovieName(){}
//    boolean checkSeatAvailability(){}
//    private setShowSchedule(){}
//    Time showMovieShowTime(){}

    public Screening(Theatre theatre, LocalDateTime startingTime) {
        this.theatre = theatre;
        this.startingTime = startingTime;
    }

    
}
