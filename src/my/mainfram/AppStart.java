package my.mainfram;

public class AppStart
{
	public static void creatGUI()
	{
		MainFrame myFrame = new MainFrame();
		myFrame.setVisible(true);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				creatGUI();
			}
			
		});

	}

}
