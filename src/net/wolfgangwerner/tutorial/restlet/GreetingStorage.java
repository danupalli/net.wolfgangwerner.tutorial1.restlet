package net.wolfgangwerner.tutorial.restlet;

public class GreetingStorage {
	private static GreetingStorage instance = new GreetingStorage();
	private String text;

	private GreetingStorage() {
		this.text = "Servus.";
	}

	public static GreetingStorage getInstance() {
		return instance;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
