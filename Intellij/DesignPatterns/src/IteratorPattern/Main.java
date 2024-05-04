package IteratorPattern;

public class Main {
    public static void main (String[] args){
        var history = new BrowserHistory();
        history.push("YouTube.com");
        history.push("Ebay.com");
        history.push("GitHub.com");
//        System.out.println(history.getUrls());

        //We want to iterate over the List, but this isn't the answer...
//        for (var i = 0; i <history.getUrls().size();i++){
//            System.out.println(history.getUrls().get(i));
//        }
        System.out.println("\n==================\n");
        Iterator iterator = history.createIterator();
        while(iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
