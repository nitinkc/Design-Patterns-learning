package com.deisgnpatterns.D1SOLIDPrinciples.SOLID.D;

public class OracleDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle database...");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnection Oracle database...");
	}
}
