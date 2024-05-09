package FacadePattern;
//MUCH NICER! Only place to make needed changes
public class NotificationServiceFacade {
    public void send(String message, String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnet();
    }
}
