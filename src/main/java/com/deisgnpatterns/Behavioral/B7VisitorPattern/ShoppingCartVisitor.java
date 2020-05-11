package com.deisgnpatterns.Behavioral.B7VisitorPattern;

public interface ShoppingCartVisitor {
	public double visit(Table table);
	public double visit(Chair chair);
}
