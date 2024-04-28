package Creational;
// Global point of access, like a president of a country
// Singletons are like GLOBAL vars, only one instance of this class at a time
//https://www.youtube.com/watch?v=tSZn4wkBIu8&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=2

public class Singleton {
	private static volatile Singleton instance;
	private String data; //any more attributes
	
	private Singleton(String data) {
		this.data = data;
	}
	
	public static Singleton getInstance(String data) {
		Singleton result = instance;
		if(result == null) {
			synchronized(Singleton.class) {
				result = instance;
				if (result == null) {
					instance = result = new Singleton(data);
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
