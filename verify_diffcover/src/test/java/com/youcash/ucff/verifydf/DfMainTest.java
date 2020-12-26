package com.youcash.ucff.verifydf;

import org.junit.Test;

public class DfMainTest {
	
	@Test
	public void dosthTest(){
		DfMain df = new DfMain();
		df.justDoSthWithTest();
		
		DfNotCommit dfc = new DfNotCommit();
		dfc.justDoSth1();
		//dfc.justDoSth2NotTest();
	}
}
