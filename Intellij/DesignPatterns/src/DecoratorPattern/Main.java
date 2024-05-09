package DecoratorPattern;
//
public class Main {
    public static void main (String[] args){
        storeCreditCard(new CloudStream());
        storeCreditCard(new EncryptedCloudStream(new CloudStream())); //Using decorator pattern!
        storeCreditCard(new CompressedCloudStream(new CloudStream()));
        storeCreditCard(new EncryptedCloudStream( new CompressedCloudStream(new CloudStream()))); // See we can mix and match!
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-0000-1111-2222");
    }
}
