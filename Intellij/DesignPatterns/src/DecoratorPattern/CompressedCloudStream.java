package DecoratorPattern;
// We can always make new classes to add features, but instead decorator is smarter....
public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed); //Using composition
    }

    private String compress(String data){
        return data.substring(0,5);
    }
}
