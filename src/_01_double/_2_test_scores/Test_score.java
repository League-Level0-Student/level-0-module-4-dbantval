package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_score {
public static void main(String[] args) {
	String score =JOptionPane.showInputDialog("What is your test score?");
double Score= Double.parseDouble(score);
 if (Score<26) {
	JOptionPane.showMessageDialog(null, "That is dissapointing, next time acually study.");
}
	
 else if(Score<50) {
	JOptionPane.showMessageDialog(null, "Hmm Try and do better next time and really study.");
}
  if (Score>69) {
	 JOptionPane.showMessageDialog(null, "Wow your a rock star AMAZING job");
	 		}
  else if (Score>50) {
			JOptionPane.showMessageDialog(null, "Really nice job! try and study a tad bit more k?");
		}
		
}
}
