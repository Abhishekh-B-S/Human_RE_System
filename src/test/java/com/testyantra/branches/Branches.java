package com.testyantra.branches;

import org.testng.annotations.Test;

public class Branches {
	
	@Test
	public void newBranch()
	{
		System.out.println("---new Branch added---");
	}

	@Test
	public void upbranch()
	{
		System.out.println("---new Branch updated---");
	}
	
	@Test
	public void delbranch()
	{
		System.out.println("---new Branch deleted---");
	}

}
