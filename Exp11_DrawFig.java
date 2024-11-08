package Expt11;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawFigures extends JPanel{

	public static void main(String[] args) {
		JFrame f= new JFrame("Experiment 11");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new DrawFigures());
		f.setSize(290, 325);
		f.setLocation(550, 25);
		f.setVisible(true);
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(150, 50, 90, 50);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.GREEN);
		g2.drawRect(60, 100, 180, 60);
		
		Graphics2D g3 = (Graphics2D) g;
		g3.setColor(Color.BLUE);
		g3.drawOval(60, 20, 180, 60);
	}
}