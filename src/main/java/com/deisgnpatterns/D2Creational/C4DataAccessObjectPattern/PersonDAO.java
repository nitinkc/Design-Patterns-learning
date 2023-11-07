package com.deisgnpatterns.D2Creational.C4DataAccessObjectPattern;

import java.util.List;

public interface PersonDAO {
	public void insert(Person person);
	public void remove(Person person);
	public List<Person> getPeople();
}
