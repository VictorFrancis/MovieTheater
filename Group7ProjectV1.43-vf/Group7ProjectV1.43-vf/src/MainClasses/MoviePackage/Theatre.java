package MainClasses.MoviePackage;

public class Theatre {
    
    private String theatreName;
    private TheatreClass theatreClass;
    private int ticketPrice;
    private int totalNumberOfSeats;
    private int availableSeats;
    private boolean seatsAvailable;

    public Theatre(String theatreName, TheatreClass theatreClass, int totalNumberOfSeats, int availableSeats, boolean seatsAvailable) {
        this.theatreName = theatreName;
        this.theatreClass = theatreClass;
        this.totalNumberOfSeats = totalNumberOfSeats;
        this.availableSeats = availableSeats;
        this.seatsAvailable = seatsAvailable;
        
        switch(theatreClass){
            case ECONOMY:
                ticketPrice = 400;
                break;
            case STANDARD:
                ticketPrice = 600;
                break;
            case PREMIUM:
                ticketPrice = 900;
                break;
            default:
                ticketPrice = 600;
        }
    }
    
//Date getMovieShowTime(){}
//String getMovieName(){}
//boolean checkSeatAvailability(){}
//void setShowSchedule(){}
//void bookSeats(int n){}

    int getTicketPrice() {
        return this.ticketPrice;
    }

    TheatreClass getTheatreClass() {
        return this.theatreClass;
    }


    
}
