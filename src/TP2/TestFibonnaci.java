package TP2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFibonnaci {

    @Test
    public void testFibo0(){
        FiboComparateur fi = new FiboComparateur(0);
        assertEquals(fi.next().intValue(),1);
    }

    @Test
    public void testFibo1(){
        FiboComparateur fi = new FiboComparateur(1);
        int res=0;
        while (fi.hasNext()){
            res= fi.next();

        }
        assertEquals(res,1);
    }

    @Test
    public void testFiboM1(){
        FiboComparateur fi = new FiboComparateur(100);
        int res = 0;
        while (fi.hasNext()){
            res= fi.next();

        }
        assertEquals(res,89);
    }


}
