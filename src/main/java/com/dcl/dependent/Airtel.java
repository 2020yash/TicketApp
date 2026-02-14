package com.dcl.dependent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements ISim {

	public Airtel() {
		System.out.println("Airtel-constructor");
	}

	@Override
	public boolean activate() {
		System.out.println("airtel sim activated");
		return true;
	}
	

}
