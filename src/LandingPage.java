import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LandingPage extends JFrame implements ActionListener {
	public JLabel l1;
	public JButton b1,b2;
	public Font f, f1;
	
	public LandingPage() {
		f = new Font("Comic Sans MS", Font.BOLD, 40);
		l1 = new JLabel("CV Maker");
                f1 = new Font("Bookman Old Style", Font.PLAIN, 14);
		l1.setFont(f);
		b1=new JButton("Login");
		b2=new JButton("Sign Up");
                b1.setFont(f1);
                b2.setFont(f1);
		l1.setBounds(100, 50, 400, 100);
		b1.setBounds(80,160,100,50);
		b2.setBounds(200,160,100,50);
		add(l1);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource())==b1) {
			new Login().setVisible(true);
		}
		else{
			new SignupUI();
		}
		
	}
}
