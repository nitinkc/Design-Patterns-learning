package com.deisgnpatterns.Behavioral.B7VisitorPattern;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
