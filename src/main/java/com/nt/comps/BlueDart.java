package com.nt.comps;




public class BlueDart implements Courier {

	public BlueDart()
	{
		System.out.println("BlueDart : 0 Param Contructore");
	}
	@Override
	public String deliver(int oid) {
		return  "Oder Id ::->" +oid+ " <-::Order is set for  deliver  using BlueDart Courier Service ";
	}

}
