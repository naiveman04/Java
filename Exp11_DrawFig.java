package Expt11;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawFigures extends JPanel{

	public static void main(String[] args) {
		JFrame f= new JFrame("Experiment 11");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new DrawFigures());
		f.setSize(500, 500);
		f.setVisible(true);
		f.setBackground(Color.white);
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(150, 50, 200, 100);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.GREEN);
		g2.drawRect(60, 100, 300, 120);
		
		Graphics2D g3 = (Graphics2D) g;
		g3.setColor(Color.BLUE);
		g3.drawOval(60, 20, 180, 60);
		
		Graphics2D g4 = (Graphics2D) g;
		g4.setColor(Color.yellow);
		g4.setFont(new Font("SANS_SERIF", Font.PLAIN, 36));
		g4.drawString("Hello", 400, 60);
	}
}
