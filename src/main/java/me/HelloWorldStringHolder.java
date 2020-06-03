package me;

public class HelloWorldStringHolder implements StringHolder {

	private static final String HELLO_WORLD = "Hello World!";

	@Override
	public String getString() {
		return HELLO_WORLD;
	}

	@Override
	public String getReversetString() {
		return reverse(HELLO_WORLD);
	}
	
	private String reverse (String input) {
		StringBuilder output = new StringBuilder();
		output.append(input);
		output.reverse();
		return output.toString();
	}

}
