package com.nt.fectory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkarFectory 
{
//static fectory methode having to the given courier object
	public static Flipkart getIntance(String courierType)
	{
		//create dependence class object
		Courier courier= null;
		if (courierType.equalsIgnoreCase("dtdc"))
		
			courier = new DTDC();
		
		else if (courierType.equalsIgnoreCase("bDart")) 
		
			courier  =  new BlueDart();
		
		else if (courierType.equalsIgnoreCase("dhl"))
		
			courier = new DHL();
		else
		throw new IllegalArgumentException("Invalide couier");
		
		//creat target clas object
		
		Flipkart fpkt = new Flipkart();
		
		fpkt.setCourier(courier);
		
		return fpkt;
	}
	
}
