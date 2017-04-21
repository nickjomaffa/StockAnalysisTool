package com.stock.analysis.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceUtil {
	
	public static BigDecimal toPrice(double rawPrice) {
		return new BigDecimal(rawPrice).setScale(2, RoundingMode.HALF_UP);
	}

}
