package Thirteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalTest {

	 @Test
	    void add() {
	        assertEquals(105, Calc.add(15,90));
	    }
	    @Test
	    void sub() {
	        assertEquals(-10, Calc.substract(100,110));
	    }
	    @Test
	    void mul() {
	        assertEquals(1500, Calc.multiply(15,100));
	    }

	    @Test
	    void mod() {
	        assertEquals(5, Calc.modulus(15,10));
	    }
	    @Test
	    void pow() {

	        assertEquals(25, Calc.power(5,2));
	    }
	    @Test
	    void sqrt() {
	        assertEquals(5, Calc.squareroot(25));
	    }
	    @Test
	    void cube() {
	        assertEquals(2, Calc.cuberoot(8));
	    }
	    @Test
	    void testExceptionIsThrown() {
	    	Calc tester = new Calc();


	        assertEquals(2,Calc.divide(4, 2));

	     try {
	        assertEquals(2,Calc.divide(1000,0));
	          assertEquals(2,Calc.divide(2,4));

	          } catch (ArithmeticException e) {
	              System.out.println("This line will not be Executed");
	           System.out.println("In the catch Block due to Exception = " + e);

	          }
	    }
	    @Test
	    void testExceptionIsThrown2() {
	    	Calc tester = new Calc();


	        assertEquals(0,Calc.modulus(4, 2));

	         try {
	        assertEquals(2,Calc.modulus(1000,0));


	          } catch (ArithmeticException e) {
	              System.out.println("This line will not be Executed");
	           System.out.println("In the catch Block due to Exception = " + e);

	          }
	    }

	}
