package com.javacource.se.factorymethod.entites;

import com.javacource.se.factorymethod.interfaces.Transport;

public class Ship implements Transport{
	@Override
	public void deliver() {
		System.out.println("Deliver by sea");
		
	}
}
