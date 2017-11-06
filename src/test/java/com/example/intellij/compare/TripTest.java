package com.example.intellij.compare;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class TripTest {
	@Test
	public void compareTo() throws Exception {

		Trip trip1 = new Trip(Optional.of(20));
		Trip trip2 = new Trip(Optional.of(10));

		Assert.assertEquals(trip1.compareTo(trip2), 1);
	}

}