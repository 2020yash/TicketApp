package com.dcl.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dcl.dependent.ISim;

@Component
public class SimService {
    
	
	private ISim sim;
	public SimService() {
		System.out.println("0-param-constructor");
	}
	
	public SimService(ISim sim) {
		this.sim = sim;
	}
	
	@Autowired
	@Qualifier("airtel")
	public void setSim(ISim sim) {
		this.sim = sim;
		System.out.println("setter called");
	}
	
	public void call() {
		boolean status = sim.activate();
		if(status) {
			System.out.println("calling...");
		}else {
			System.out.println("network issue!");
		}
	}

}
