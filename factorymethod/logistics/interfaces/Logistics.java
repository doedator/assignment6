package com.javacource.se.factorymethod.logistics.interfaces;

import com.javacource.se.factorymethod.interfaces.Transport;

public interface Logistics {
	public void planDelivery(String type);
	
	public Transport createTransport(String type);
}
