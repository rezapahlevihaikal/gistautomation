package com.gistgithub.test.strategy;

import com.gistgithub.test.strategy.Chrome;
import com.gistgithub.test.strategy.DriverStrategy;
import com.gistgithub.test.strategy.Firefox;
import com.gistgithub.test.utils.Constants;

public class DriverStrategyImplementator {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
		
		case Constants.FIREFOX:
			return new Firefox();
		
		default:
			return null;
		}
	}
}
