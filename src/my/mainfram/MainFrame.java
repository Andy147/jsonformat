package my.mainfram;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class MainFrame extends JFrame
{
	JToolBar toolBar = new JToolBar();
	JButton format = new JButton("格式化");
	JTextArea textArea = new JTextArea();
	public MainFrame()
	{
		super("json数据格式化");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(600, 400);
	    JPanel root = new JPanel();
	    this.setContentPane(root);
	    root.setLayout(new BorderLayout());
	    root.add(toolBar , BorderLayout.PAGE_START);
	    toolBar.setFloatable(false);
	    format.setFocusable(false);
	    toolBar.add(format);
	    
	    root.add(textArea , BorderLayout.CENTER);
	    
	}

}
