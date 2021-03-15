package com.javacource.se.factorymethod.logistics;

import com.javacource.se.factorymethod.entites.Ship;
import com.javacource.se.factorymethod.entites.Truck;
import com.javacource.se.factorymethod.interfaces.Transport;
import com.javacource.se.factorymethod.logistics.interfaces.Logistics;

public class RoadLogistics implements Logistics {
	@Override
	public Transport createTransport(String type) {
		if (type == "SHIP") {
			return new Ship();
		}
		return new Truck();
		
	}@Override
	public void planDelivery(String type) {
		Transport t = createTransport(type);
		System.out.println(t);
	}
}
