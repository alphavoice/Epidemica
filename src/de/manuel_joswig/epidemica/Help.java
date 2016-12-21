package de.manuel_joswig.epidemica;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Shows the help frame
 * 
 * @author		Manuel Joswig
 * @copyright	2014 Manuel Joswig
 */
public class Help extends JFrame {
	public static final long serialVersionUID = 1L;
	
	public Help() {
		setTitle("Hilfe");
		setSize(500, 400);
		
		addGUIComponents();
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	private void addGUIComponents() {
		JLabel lblContent = new JLabel("<html><body><h3>FAQ - H�ufig gestellte Fragen</h3><br><b>Was ist Epidemica?</b><br>Epidemica ist eine Software, um die Ausbreitung eines Influenzavirus zu simulieren. Die verschiedenen Optionen und Parameter erlauben eine individuelle Gestaltung des Krankheitsverlaufs.<br><br>"
				+ "<b>Was sind Nachbarschaftsbeziehungen?</b><br>Die Infektionswahrscheinlichkeit einer Zelle ist von der festgelegten Nachbarschaftsbeziehung abh�ngig. W�hrend die Von-Neumann-Nachbarschaft nur die direkten Nachbarn (oben, unten, links, rechts) beinhaltet, umfasst die Moore-Nachbarschaft auch die dazwischenliegenden Diagonalelemente.<br><br>"
				+ "<b>Was bedeuten die Farben der Zellen?</b><br>Die Farbe steht f�r den Zustand der jeweiligen Zelle. Gr�n bedeutet gesund, rot hei�t infiziert, violett steht f�r resistent und wei� f�r tot.<br><br>"
				+ "<b>Wo finde ich die Auswertung einer Simulation?</b><br>S�mtliche Dateien, welche statistische Daten �ber die Simulation enthalten, befinden sich in einem mit der ID der Simulation benannten Unterordner des Ordners \"eval\".</body></html>");
		lblContent.setIcon(new ImageIcon(getClass().getResource("/question-icon.png")));
		add(lblContent);
	}
}