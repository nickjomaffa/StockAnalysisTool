package com.stock.analysis.doubler;

import org.junit.Test;

import com.stock.analysis.doubler.Doubler;
import com.stock.analysis.doubler.DoublerImpl;

public class DoublerImplTest {
    
    @Test
    public void testIt() {
        Doubler doubler = new DoublerImpl();
        assert doubler.doubleIt(2) == 4;
    }
}
