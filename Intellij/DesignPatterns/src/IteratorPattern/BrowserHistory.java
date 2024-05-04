package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    //private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;

    public void push(String url){
        //urls.add(url);
        urls[count] = url;
        count++;
    }

    public String pop(){
//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//        return lastUrl;
        count--;
        return urls[count];
    }

    public Iterator createIterator(){
//        return new ListIterator(this);
        return new ArrayIterator(this);
    }
//    public List<String> getUrls() {
//        return urls;
//    }
//    public void setUrls(List<String> urls) {
//        this.urls = urls;
//    }

    //Iterator Methods: next() "advances current item", current() "return current", hasNext() "peek"
    //But they can't be here since it breaks SINGLE RESPONSIBILITY PRINCIPLE, Make an iterator class

//    public class ListIterator implements Iterator<String>{
//        private BrowserHistory history;
//        private int index;
//
//        public ListIterator(BrowserHistory history){
//            this.history = history;
//        }
//        @Override
//        public void next() {
//            index++;
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//    }

    public class ArrayIterator implements Iterator<String> {
        private BrowserHistory history;
        private int index;
        public ArrayIterator(BrowserHistory history){
            this.history=history;
        }
        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }
    }




}
