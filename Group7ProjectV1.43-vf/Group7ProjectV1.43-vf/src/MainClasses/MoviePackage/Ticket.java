package MainClasses.MoviePackage;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Ticket implements Serializable{
    
    private Movie movieName;
    private Theatre theatreName;
    private int ticketPrice;    //inferred from theatre
    private TheatreClass theatreClass;
    private LocalDateTime dateOfPurchase;
    
    

//    void setTicketInfo(){}
//    void getTicketInfo(){}
//    Integer buyTicket(){}
//    boolean ticketAvailability(){}
//    void print(){}
//    void addTicket(){}
//    void removeTicket(){}
//    Integer ticketSaleCount(){}
//    boolean paymentVerification(){}

    public Ticket(Movie movieName, Theatre theatreName) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        
        this.ticketPrice = theatreName.getTicketPrice();
        this.theatreClass = theatreName.getTheatreClass();
        this.dateOfPurchase = LocalDateTime.now();
    }

    

    
}
