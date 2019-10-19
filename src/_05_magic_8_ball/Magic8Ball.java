//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static class Validation {
		public static void main(String[] args) {
			// 2. Make a variable that will hold a random number and put a random number
			// into this variable using "new Random().nextInt(4)"
			int hello = new Random().nextInt(5);
			// 3. Print out this variable
			System.out.println(hello);
			// 4. Get the user to enter a question for the 8 ball
			JOptionPane.showInputDialog(null, "Enter A Question For The Magic 8 Ball To Answer!			"
					+ "				Will...");
			// 5. If the random number is 0
			 JOptionPane.showMessageDialog(null,"Yes");
			// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Enter another message for the magic 8 ball");
			// 6. If the random number is 1
JOptionPane.showMessageDialog(null,"No");
			// -- tell the user "No"
JOptionPane.showMessageDialog(null, "Enter another message for the magic 8 ball");
			// 7. If the random number is 2
JOptionPane.showMessageDialog(null,"Maybe you should ask google?");
			// -- tell the user "Maybe you should ask Google?"

			// 8. If the random number is 3
JOptionPane.showMessageDialog(null, "Enter another message for the magic 8 ball");
JOptionPane.showMessageDialog(null,"Possibly");
			// -- write your own answer
//fnished
		}
	}
}