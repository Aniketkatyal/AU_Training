package DesignPatterns.Strategy;

//Benefits:
//It provides a substitute to subclassing.
//It defines each behavior within its own class, eliminating the need for conditional statements.
//It makes it easier to extend and incorporate new behavior without changing the application.

public interface Strategy {
	
	public float calculation(float a, float b);

}
