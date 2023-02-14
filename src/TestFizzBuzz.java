import org.junit.Test;

import static  org.junit.Assert.assertEquals;

public class TestFizzBuzz {

    @Test
    public void testFizzBuzz1(){
        assertEquals("1",FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzz2(){
        assertEquals("2",FizzBuzz.fizzBuzz(2));
    }

    @Test
    public void testFizzBuzz4(){
        assertEquals("4",FizzBuzz.fizzBuzz(4));
    }

    @Test
    public void testFizzBuzz3(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testFizzBuzz5(){
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz9(){
        assertEquals("9",FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzzMultiple3et5(){
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }




}
