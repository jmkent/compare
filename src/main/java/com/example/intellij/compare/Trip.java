package com.example.intellij.compare;

import java.util.Optional;

public class Trip implements Comparable<Trip> {
	Optional<Integer> originId;

	public Trip(Optional<Integer> originId) {
		this.originId = originId;
	}

	public Optional<Integer> getOriginId() {
		return originId;
	}

	@Override
	public int compareTo(Trip o) {
		return this.originId.isPresent() ?
				(o.originId.isPresent() ? Integer.compare(this.originId.get(), o.originId.get()) : -1) :
				(o.originId.isPresent() ? 1 : 0);
	}
}
