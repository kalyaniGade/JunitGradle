package SruJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class AppTest {

	App a;
	@BeforeEach
	public void init() {
		a = new App();
		System.out.println("creating instance");
	}
	
	@Test
	public void test() {
		
       assertEquals(20,10+10);
	}
	@Test
	public void test1() {
		//assertThrows(ArithmeticException.class,()->a.div(1,0),"Divide by zero Exception");
	}

}
