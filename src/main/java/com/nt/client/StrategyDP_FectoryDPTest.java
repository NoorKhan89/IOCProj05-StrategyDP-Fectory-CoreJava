package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.fectory.FlipkarFectory;

/**
 * Hello world!
 */
public class StrategyDP_FectoryDPTest {
    public static void main(String[] args) 
    {
    // use factory pattern class to get fectory class object our clas dependecny oject 
    	Flipkart fpkt = FlipkarFectory.getIntance("dtdc");
    	String resultMsg = fpkt.Shoping (new String[]{"kurta","Paejamma ", "Pathani"," Sumrah","Mishwak","Haleem"},
    									new double [] {2000.0,3000.0,500.0,200.0,150.0,150.0});
    	System.out.println(resultMsg);
    	
    }
}
	