import javax.swing.SwingUtilities;


public class AppStart {

	public static void main(String[] args) {
		
		// when i change sth
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO ;
				new GameStarter();
			}
		});
	}
	
}
