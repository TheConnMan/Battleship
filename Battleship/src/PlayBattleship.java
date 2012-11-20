import javax.swing.JFrame;

public class PlayBattleship extends Board {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8685169340396672245L;
	
	/**
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Board newContentPane = new Board();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
        String firstMove = "C4";
        String secondMove = "D4";
        int length = 4;
        //Ship ship = new Ship(firstMove, secondMove, length);
        firstMove = "D4";
        secondMove = "C4";
        length = 3;
        Ship ship1 = new Ship(firstMove, secondMove, length);
    }
}
