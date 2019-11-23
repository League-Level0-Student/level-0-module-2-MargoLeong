package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = "";
		height = JOptionPane.showInputDialog(null, "How Tall Are You?____in inches");
		int height2 = Integer.parseInt(height);

		if (height2 > 48) {
			JOptionPane.showMessageDialog(null, "you can come on the roller coaster!");
		} else if (height2 <= 48) {
			JOptionPane.showMessageDialog(null, "you cannot ride on this roller coaster!");
		}
	}
}