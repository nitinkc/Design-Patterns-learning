package com.deisgnpatterns.D2Creational.C3BuilderPattern;

import java.sql.ConnectionBuilder;
import lombok.Builder;

@Builder
public class Person {

	private  String name;
	private  String email;
	private  String address;
	private  int age;
	private  String nameOfMother;

}