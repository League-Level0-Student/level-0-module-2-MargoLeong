
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0
//as
//d
package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; 5 > i; i++) {
			Random random = new Random();

			int randomNumber = random.nextInt(6);

			if(randomNumber==5) {
				
			
			// 1. Use each value of randomNumber to give the user a random compliment.
			JOptionPane.showMessageDialog(null, "You are awesome");}
			JOptionPane.showMessageDialog(null, "you are amazing");
			JOptionPane.showMessageDialog(null, "you are outstanding");
			JOptionPane.showMessageDialog(null, "you are cool");
			JOptionPane.showMessageDialog(null, "you are trash...");
			JOptionPane.showMessageDialog(null, "sorry");
		}
			// 2. Repeat all the code above 10 times
		}

	// 3. Find someone to test out your program. They will like it :)
}
//Finished