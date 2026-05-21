package com.nt.comps;


public final class DHL implements Courier {

	public DHL()
	{
		System.out.println("DHL : 0 Param Contructore");
	}
	@Override
	public String deliver(int oid) {
		return " Oid is  "+ oid + " <-:: Order is set for  deliver  using DHL Courier Service ";
	}

}
