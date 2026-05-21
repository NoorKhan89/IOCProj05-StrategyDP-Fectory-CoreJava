package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	//Has - A  propertiy
private Courier courier;

//setter getter Injection(assinging dependace class obj to target class obje )

public Flipkart()
{
	System.out.println("Flipkart 0 param Contructore...");
}

public  void setCourier(Courier courier)

{
	System.out.println("Flipkart.setCourier(----) ");
	this.courier = courier;
}
  //b.method

public String Shoping(String items[],double prices[])
{
	//calculate billAmount
	
	double total =0.0;
	
	 for (double p:prices)
	 
		 total = total + p;
		 
		 //  gernate random number has a oder id
		 int oid =  new Random().nextInt(1000);
		 
		 // use Courier 
		 String msg = courier.deliver(oid);
		 
		 return Arrays.toString(items)+" <-::are purchessing having price ::-> "+Arrays.toString(prices) +"\n  bill maount ::-> "+total+ "  "+msg;
		 
 }
}




















