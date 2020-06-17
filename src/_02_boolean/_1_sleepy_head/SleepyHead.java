package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
    String day =JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
			isWeekend = true;
			
		}
		else{
			isWeekend=false;
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		if (isWeekend) {
		 JOptionPane.showMessageDialog(null, "Sleep in");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam

		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is the game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "Game is over");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
	String color=	JOptionPane.showInputDialog("What color should I draw with?");
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape =JOptionPane.showInputDialog("What shape should I draw?");
		if (color.equalsIgnoreCase("Red")) {
			isRed=true;
		}
		else {
			isRed=false;
		}
		if (shape.equalsIgnoreCase("Square")) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	

	if(isRed&&isSquare) {
		drawRedSquare();}
	
	else {
		JOptionPane.showMessageDialog(null, "Sorry I dont know how to draw that");
	}
		// Complete the rest of this method
	}	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenWidth(10);
		rob.setPenColor(Color.RED);
		rob.setSpeed(50);
		for (int i = 0; i < 5; i++) {
			rob.move(260);
			rob.turn(90);	
		}
			
	
	}
	
}

