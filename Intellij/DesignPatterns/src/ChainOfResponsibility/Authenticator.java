package ChainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }
    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword() == "cupcake");
        System.out.println("Auth");
        return !isValid;
    }
}
