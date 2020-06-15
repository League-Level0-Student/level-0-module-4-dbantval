package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */ 

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickles =JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
String dimes =JOptionPane.showInputDialog("How many dimes do you have?");
String quartes = JOptionPane.showInputDialog("How many quarters to you have?");
		// Ask the user how many dimes they have, and convert their answer
int Nickles =Integer.parseInt(nickles);
int Quarters =Integer.parseInt(quartes);
int Dimes = Integer.parseInt(dimes);

double money = Nickles * 0.05 + Quarters * 0.25 + Dimes * 0.10;
JOptionPane.showMessageDialog(null, "You have "+money+" dollers");
		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

