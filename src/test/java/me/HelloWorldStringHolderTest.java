package me;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldStringHolderTest {

	private static final String HELLO_WORLD = "Hello World!";
	private static final String REVERSED_HELLO_WORLD = "!dlroW olleH";

	private StringHolder underTest;
	
	@BeforeEach
	void setUp() throws Exception {
		this.underTest = new HelloWorldStringHolder();
	}

	@Test
	void testGetString() {
		assertThat(this.underTest.getString(), is(HELLO_WORLD));
	}
	
	@Test
	void testGetReversedString() throws Exception {
		assertThat(this.underTest.getReversetString(), is(REVERSED_HELLO_WORLD));
	}

}
