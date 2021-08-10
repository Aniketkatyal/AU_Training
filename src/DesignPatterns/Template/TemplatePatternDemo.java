package DesignPatterns.Template;
//A Template Pattern says that "just define the skeleton of a function in an operation, deferring some steps to its subclasses".
//
//Benefits:
//It is very common technique for reusing the code.This is only the main benefit of it.
//Usage:
//It is used when the common behavior among sub-classes should be moved to a single common class by avoiding the duplication.
public class TemplatePatternDemo {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {


	      Game game = new Chess();
	      game.play();
	      System.out.println();
	      game = new Soccer();
	      game.play();		
	   }

}
