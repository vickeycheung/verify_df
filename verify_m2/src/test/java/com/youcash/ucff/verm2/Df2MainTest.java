package com.youcash.ucff.verm2;

import org.junit.Test;

public class Df2MainTest {
	
	@Test
	public void dosthTest(){
		Dfm2Main df = new Dfm2Main();
		df.justDoSthWithTest();
		
		Dfm2NotCommit dfc = new Dfm2NotCommit();
		dfc.justDoSth1();
		//dfc.justDoSth2NotTest();
	}
}
