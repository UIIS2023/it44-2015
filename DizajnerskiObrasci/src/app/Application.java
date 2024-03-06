package app;

import javax.swing.JFrame;

import mvc.Controller;
import mvc.Frame;
import mvc.Model;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridLayout;


public class Application {

	public static void main(String[] args) {
		
		Frame frmNemanjaTepicIt = new Frame();
		frmNemanjaTepicIt.setTitle("IT44-2015-Nemanja Tepic");
		frmNemanjaTepicIt.getView().setBackground(new Color(255, 255, 102));
		GridBagLayout gridBagLayout = (GridBagLayout) frmNemanjaTepicIt.getContentPane().getLayout();
		gridBagLayout.rowHeights = new int[]{0, 338, 154};
		Model model = new Model();
		
		Controller controller = new Controller(model,frmNemanjaTepicIt);
		
		frmNemanjaTepicIt.setController(controller);
		frmNemanjaTepicIt.setSize(1096,600);
		frmNemanjaTepicIt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		model.addObserver(frmNemanjaTepicIt);
		frmNemanjaTepicIt.getView().setModel(model);
		frmNemanjaTepicIt.getView().setLayout(new GridLayout(1, 0, 0, 0));
		frmNemanjaTepicIt.setVisible(true);
		

	}
}
