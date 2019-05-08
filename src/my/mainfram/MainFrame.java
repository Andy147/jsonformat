package my.mainfram;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

import org.json.JSONArray;
import org.json.JSONObject;

import my.json.utils.JsonUtils;

public class MainFrame extends JFrame
{
	JToolBar toolBar = new JToolBar();
	JButton format = new JButton("��ʽ��");
	JTextArea textArea = new JTextArea();
	public MainFrame()
	{
		super("json���ݸ�ʽ��");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(800, 600);
	    JPanel root = new JPanel();
	    this.setContentPane(root);
	    root.setLayout(new BorderLayout());
	    root.add(toolBar , BorderLayout.PAGE_START);
	    toolBar.setFloatable(false);
	    format.setFocusable(false);
	    toolBar.add(format);
	    textArea.setTabSize(50);
	    JScrollPane jc = new JScrollPane(textArea);
	    root.add(jc , BorderLayout.CENTER);
	    format.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				doFormat();
				
			}
		});
	    
	}
	protected void doFormat()
	{
		String text = textArea.getText();
		if(JsonUtils.isJson(text))
		{
			JSONObject json = new JSONObject(text);
			text = json.toString(4);
		}
		else if(JsonUtils.isJSONArr(text))
		{
			JSONArray json = new JSONArray(text);
			text = json.toString(4);
		
		}
		else
		{
			JOptionPane.showMessageDialog(this, "����JOSN��ʽ������������");
			return;
		}
		textArea.setText(text);
		
	}

}
