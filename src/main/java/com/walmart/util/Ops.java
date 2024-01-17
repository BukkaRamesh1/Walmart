package com.walmart.util;

import java.util.Random;

public class Ops {

	public long id() {
		Random random = new Random();

        // Generate a random long
        long randomLong = random.nextLong();

        return randomLong;
	}
}
