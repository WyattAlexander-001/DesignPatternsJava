package FacadePattern;

public class Main {
    public static void main (String[] args){
        //This works but is alot of work, and alot of coupling use a facade to streamline!
        //make a NotificationService class instead to take care of all this:
//        var server = new NotificationServer();
//        var connection = server.connect("ip");
//        var authToken = server.authenticate("appID", "key");
//        var message = new Message("WHAT'S UP??");
//        server.send(authToken, message, "target");
//        connection.disconnet();
        var service = new NotificationServiceFacade();
        service.send("What up world", "trarget");


    }
}
