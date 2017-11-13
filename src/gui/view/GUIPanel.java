package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Used to add all components to the subclass fo JPanel
	 * This installs them into thepanel so they are seen in the GUI.
	 */
	private void setupPanel ()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		this.add(firstButton);
		
	}
	
	
	 /**
	  *  This is used to hold all the layout and arrangement code for SpringLayout.
	  */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -10, SpringLayout.SOUTH, this);
		
	}
	
	 /**
	  *  This helper method is used to link any GUI components to the associated listeners.
	  */
	private void setupListeners()
	{
		
	}
}
