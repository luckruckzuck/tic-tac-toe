import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonController implements ActionListener{
	
	private String pressedNumber;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// get key code and inform controller
		// TODO get action commands and order of grid layout
		pressedNumber = e.getActionCommand();
		
		switch(pressedNumber){
		
		case "1":
			// 
		}
		
	}
	
}
