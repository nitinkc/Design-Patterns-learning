package com.deisgnpatterns.D3Behavioral.B7VisitorPattern;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
