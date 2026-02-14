package com.dcl.dependent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sim")
@Primary
public class JIo implements ISim {

	public JIo() {
		System.out.println("jio constructor");
	}

	@Override
	public boolean activate() {
		System.out.println("jio sim activated");
		return true;
	}

}
