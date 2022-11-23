package com.testyantra.corporate;

import org.testng.annotations.Test;

public class Department {
	
	@Test
	public void newdept()
	{
		System.out.println("---new department added---");
	}

	@Test
	public void updept()
	{
		System.out.println("---new department updated---");
	}
	
	@Test
	public void deldept()
	{
		System.out.println("---new department deleted---");
	}
}
