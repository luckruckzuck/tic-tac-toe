import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// TODO Observer implementieren
public class View implements Observer{
	
	private Model model;
	private Controller controller;
		
	public View(Model model, Controller controller){
		this.model = model;
		this.controller = controller;
		createAndShowGUI();
	}
	/**
	 * Create and show GUI.
	 */
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("TIC TAC TOE");
		frame.setSize(640, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set up content pane
		addComponentsToPane(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}

	private static void addComponentsToPane(Container contentPane) {
		// TODO Auto-generated method stub
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints cons;
		
		cons = new GridBagConstraints();
		
		// Place it on Top Left
		cons.gridx = 0;
		cons.gridy = 0;	
		
		cons.gridwidth = 3;
		cons.gridheight = 3;
		
		JPanel gamePanel = new JPanel(new GridLayout(3, 3, 2, 2));
		setupGamePanel(gamePanel);
		gamePanel.setVisible(true);
		contentPane.add(gamePanel, cons);
	}
	
	
	
	private static void setupGamePanel(JPanel gamePanel) {
		
		JButton[] buttons = new JButton[9];

		
		for(int i = 8; i >= 0; i--){
			buttons[i] = new JButton();
			buttons[i].setPreferredSize(new Dimension(70, 45));
			//buttons[i].setActionCommand(numberAsString);
			//buttons[i].addActionListener(controller);
			gamePanel.add(buttons[i]);
		}
	}
	// TODO!
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
