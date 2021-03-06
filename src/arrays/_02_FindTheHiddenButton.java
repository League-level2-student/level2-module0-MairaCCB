/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener, MouseListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;

	// 2 create an integer variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String posNumber = JOptionPane.showInputDialog("Enter a positive number below");
		int intButton = Integer.parseInt(posNumber);

		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		buttons = new JButton[intButton];

		// 5. Make a for loop to iterate through the JButton array
		for (int a = 0; a < intButton; a++) {

			// 6. initialize each JButton in the array
			buttons[a] = new JButton();
			// 7. add the ActionListener to each JButton
			buttons[a].addMouseListener(this);
			// 8. add each JButton to the panel
			panel.add(buttons[a]);
		}

		// 9 add the panel to the window
		window.add(panel);

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// 11. set the JFrame to visible.
		window.setVisible(true);

		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Click around to try and find the hidden button beneath these buttons!");

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random r = new Random();
		hiddenButton = r.nextInt(intButton);

		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		buttons[hiddenButton].setText("ME!");

		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		System.out.println(hiddenButton);
		
		//17. if the hiddenButton is clicked, tell the user that they win.
			if(buttons[hiddenButton] == buttonClicked) {
			JOptionPane.showMessageDialog(null, "You won!");
		}
		//18. else tell them to try again
			else {
			JOptionPane.showMessageDialog(null, "Try again.");
		}
		}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
