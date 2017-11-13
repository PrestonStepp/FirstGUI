package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
		
		setupPanel();
	}
	
	/**
	 * Used to add all components to the subclass fo JPanel
	 * This installs them into thepanel so they are seen in the GUI.
	 */
	private void setupPanel ()
	{
		this.add(firstButton);
	}
	
	/**
	 * This is used to hold all the layout and arrangement code foer SpringLayout.
	 */
	private void setupLayout()
	{
		
	}
	/**
	 * This helper method is used to link any GUI components to the associated listeners.
	 */
	private void setupListeners()
	{
		
	}
}
