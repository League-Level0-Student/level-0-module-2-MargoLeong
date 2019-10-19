package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {

			int lottery = new Random().nextInt(6);
			System.out.println(lottery);
			JOptionPane.showMessageDialog(null, lottery);
		}
	}

}
//finished