package gofo;
import java.util.ArrayList;
public class System {
    private ArrayList<Playground> playgrounds= new ArrayList<Playground>();
    private ArrayList<PlaygroundOwner> owners= new ArrayList<PlaygroundOwner>();
    private ArrayList<Player> players= new ArrayList<Player>();
    private ArrayList<Playground> waitingPlaygrounds= new ArrayList<Playground>();
    private ArrayList<Playground> suspendedPlaygrounds= new ArrayList<Playground>();
    private ArrayList<Request> requests= new ArrayList<Request>();
    private ArrayList<Booking> bookings= new ArrayList<Booking>();
    
    public void searchAndDisplayPlaygrounds(){
        
    }
    public void checkEmail(){
        
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public void addPlayground(Playground playground){
        playgrounds.add(playground);
    }
    public void addPlaygroundOwner(PlaygroundOwner owner){
        owners.add(owner);
    }
    public void addWaiting(Playground ground){
        waitingPlaygrounds.add(ground);
    }
    public void addSuspended(Playground ground){
        suspendedPlaygrounds.add(ground);
    }
    public void makeRequest(){
        Request request=new Request();
    }
    public void addRequest(Request request){
        requests.add(request);
    }
    public void addBooking(Booking booking){
        booking.add(booking);
    }
    public void makeBooking(){
        Booking booking=new Booking();
    }
}
