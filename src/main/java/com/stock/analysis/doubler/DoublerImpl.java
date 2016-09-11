package com.stock.analysis.doubler;

import org.springframework.stereotype.Component;

@Component
public class DoublerImpl implements Doubler {
	
    public int doubleIt(int toDouble) {
        return toDouble * 2;
    }
}
