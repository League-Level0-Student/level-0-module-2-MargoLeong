package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = "";
		age = JOptionPane.showInputDialog(null, "how old are you?");
		int age2 = Integer.parseInt(age);
	if (age2>=18) {
	JOptionPane.showInputDialog(null,"who do you want to be president");
	JOptionPane.showMessageDialog(null,"thank you for your vote");
	}else if (age2<18) {
	JOptionPane.showMessageDialog(null,"you cannot vote. ");
	}
	
	
	}

}
