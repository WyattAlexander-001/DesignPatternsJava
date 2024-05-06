package ChainOfResponsibility;
//Pipeline
public class Main {
    public static void main (String[] args){
        System.out.println("Chain of Responsibility Pattern:");
        //Auth ->log ->compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var auth = new Authenticator(logger);
        var server = new WebServer(auth);

        server.handle(new HttpRequest("admin", "cupcake"));
        System.out.println("======");
        server.handle(new HttpRequest("admin", "cupcake!"));


    }
}
