package SnakeG;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 30;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 150;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyPart = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
	GamePanel(){
		random = new Random();
		showGameRule();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		//This means that the component can accept keyboard input from the user
		this.setFocusable(true);
		//is used to respond to keyboard input events within a specific component.
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}
	public void startGame() {
		newApple();
		running =true;
		
		timer = new Timer(DELAY,this);
		timer.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {

        if (running) {
            for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
            }
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
            for (int i = 0; i < bodyPart; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.orange);
            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Оноо:" + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Оноо:" + applesEaten)) / 2, g.getFont().getSize());
        } else {
            gameOver(g);
        }
    }
	public void newApple() {
		 int randomX = random.nextInt(SCREEN_WIDTH - UNIT_SIZE);
		 int randomY = random.nextInt(SCREEN_HEIGHT - UNIT_SIZE);
	     appleX = randomX - randomX % UNIT_SIZE;
    	 appleY = randomY - randomY % UNIT_SIZE;
	}
	public void move() {
		for(int i = bodyPart;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		switch(direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		
	    case 'L':
		x[0] = x[0] - UNIT_SIZE;
		break;
	  case 'R':
		x[0] = x[0] + UNIT_SIZE;
		break;
	}
	}
	public void checkApple() {
		if((x[0] == appleX) && (y[0] == appleY)) {
			bodyPart++;
			applesEaten++;
				newApple();
		}
	}
	public void checkCollisions() {
		for(int i = bodyPart;i>0;i--) {
			if((x[0] == x[i]) && (y[0] == y[i])) {
				running = false;
			}
		if(x[0] < 0) {
			running = false;
		}
		if(x[0] > SCREEN_WIDTH) {
			running = false;
		}
		if(y[0] < 0) {
			running = false;
		}
		if(y[0] > SCREEN_HEIGHT) {
			running = false;
		}
		if(running == false) {
			timer.stop(); 
		}
		}
	}
	public void gameOver(Graphics g) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
	}
    public class MyKeyAdapter extends KeyAdapter{
    	@Override
    	public void keyPressed(KeyEvent e) {
    		switch(e.getKeyCode()) {
    		case KeyEvent.VK_LEFT:
    		case KeyEvent.VK_A:
    			if(direction != 'R') {
    				direction = 'L';
    			}
    		break;
    		case KeyEvent.VK_RIGHT:
    		case KeyEvent.VK_D:
    			if(direction != 'L') {
    				direction = 'R';
    			}
    		break;
    		case KeyEvent.VK_UP:
    		case KeyEvent.VK_W:
    			if(direction != 'D') {
    				direction = 'U';
    			}
    		break;
    		case KeyEvent.VK_DOWN:
    		case KeyEvent.VK_S:
    			if(direction != 'U') {
    				direction = 'D';
    			}
    		break;
    		}
    	}
    }
    public void showGameRule() {
        JDialog dialog = new JDialog();
        ImageIcon icon = new ImageIcon("/Users/macbookpro15/Documents");

        JOptionPane.showMessageDialog(dialog,
                "Welcome to Snake Game!\n" +
                "Use arrow keys or WASD to control the snake.\n" +
                "Eat the red apples to grow.\n" +
                "Avoid colliding with the snake's body or the walls.\n" +
                "Press any key to start the game.\n\n" +
                "Screen Size: " + SCREEN_WIDTH + "x" + SCREEN_HEIGHT,
                "Game Rule",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
