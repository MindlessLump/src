import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Game {
	static protected Label label;
	static protected JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("GraphicsGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsPanel graphicsPanel = new GraphicsPanel();
		graphicsPanel.setBackground(Color.WHITE);
		frame.add(graphicsPanel);
		frame.setSize(1280, 720);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static int getRandom(int bounds) {
		Random r = new Random();
		return r.nextInt(bounds);
	}
}

class GraphicsPanel extends JPanel {
	private static final long serialVersionUID = 1L; //Suppress warnings
	public int[][] boids = new int[64][3];
	
	public void paintComponent(Graphics g) {
		
	}
}