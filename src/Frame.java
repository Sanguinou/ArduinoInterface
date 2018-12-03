import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class Frame extends JFrame {
	
	private Panel pan = new Panel();
	private Button but= new Button("bruh");

	public Frame() {
		
		this.setVisible(true);
		this.setTitle("Fridge overwatch");
		this.setSize(1000, 750);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		JPanel b1 = new JPanel();
		b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		b1.add(but);
		
		JPanel b2 = new JPanel();
		b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		b2.add(pan);
		
		JPanel b3 = new JPanel();
		b3.setLayout(new BoxLayout(b3, BoxLayout.PAGE_AXIS));
		b3.add(b2);
		b3.add(b1);
		
		this.getContentPane().add(b1);
	}
}
