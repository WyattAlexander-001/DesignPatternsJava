package ProxyPattern;
//Making Agents for an object, it forwards message to obj (can do logging and caching etc)
public class Main {
    public static void main (String[] args){
        var library = new Library();
        String[] fileNames = {"Book1", "Book2", "Book3"}; //Assume a real database
//        for (var fileName : fileNames){
//            library.add(new RealEbook(fileName)); //Bad
//        } //This is expensive to load into memory, we need a proxy....

        for (var fileName : fileNames){
            //library.add(new EbookProxy(fileName)); //Good
            library.add(new LoggingEbookProxy(fileName)); //Also good!
        }
        library.openEbook("Book1");
        System.out.println("==============");
        library.openEbook("Book2");
    }
}
