package com.nt.comps;


public final class DTDC implements Courier {

	public DTDC()
	{
		System.out.println("DTDC : 0 Param Contructore");
	}
	@Override
	public String deliver(int oid) {
		return "Oder Id  " +oid+ "  <-:: Order is set for  deliver  using DTCD  Courier Service ";
	}

}
