/**
 * 
 */
package eu.devbrain.PomoTimer.Controller;
import eu.devbrain.PomoTimer.View.MainWindow;
/**
 * @author Matze
 *
 */
public class MainWindowController extends MainController {
	MainWindow view = new MainWindow(this);

	public MainWindowController() {
		// TODO Auto-generated constructor stub
		view.setVisible(true);
	}
	
}
