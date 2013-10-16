package eu.devbrain.PomoTimer.View;
import eu.devbrain.PomoTimer.Controller.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	public MainWindowController ctrl;
	private static final long serialVersionUID = -3926918934045045115L;
	private JPanel contentPane;
	private final Action menuFileEndApplicationAction = new MenuFileEndApplicationAction();
	private final Action openIntervalsWindow = new OpenIntervalsWindowAction();

	/**
	 * Create the frame.
	 */
	public MainWindow(MainWindowController ctrl) {
		this.ctrl = ctrl;
		setResizable(false);
		setTitle("PomoTimer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mntmBeenden.setAction(menuFileEndApplicationAction);
		mntmBeenden.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnDatei.add(mntmBeenden);
		
		JMenu mnEinstellungen = new JMenu("Einstellungen");
		menuBar.add(mnEinstellungen);
		
		JMenuItem mntmIntervalle = new JMenuItem("Intervalle");
		mntmIntervalle.setAction(openIntervalsWindow);
		mnEinstellungen.add(mntmIntervalle);
		
		JMenuItem mntmHabitrpg = new JMenuItem("HabitRPG");
		mnEinstellungen.add(mntmHabitrpg);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

	private class MenuFileEndApplicationAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = -2451073591568791239L;
		public MenuFileEndApplicationAction() {
			putValue(NAME, "Beenden");
			putValue(SHORT_DESCRIPTION, "Beendet das Programm");

		}
		public void actionPerformed(ActionEvent e) {
			ctrl.endProgram();
		}
	}
	private class OpenIntervalsWindowAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4331031793390278235L;
		public OpenIntervalsWindowAction() {
			putValue(NAME, "Intervalle");
			putValue(SHORT_DESCRIPTION, "Dauer der Arbeits- und Pausenphasen sowie Intervalle festlegen");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("Intervallfenster");
		}
	}
}
