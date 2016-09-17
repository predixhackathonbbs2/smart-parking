package com.ge.smartparking.jpa.enums;

import java.util.Random;

public enum ParkingStatus {

	A,

	N;



	private static final ParkingStatus[] VALUES = values();

	private static final int SIZE = VALUES.length;
	private static final Random RANDOM = new Random();

	public static ParkingStatus getRandomLetter()  {
		return VALUES[RANDOM.nextInt(SIZE)];
	}
}
