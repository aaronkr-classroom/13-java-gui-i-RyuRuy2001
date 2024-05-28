import javax.swing.*;
import java.awt.*;

public class Ex1401 extends JFrame{

	public Ex1401( ) {
		setTitle("프레임 및 아이콘");
		setSize(600, 300);
		// setDefaultCloseOperation(JFrame.ExIT_IN_ClOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		add(panel);
		
		setIconImage(new ImageIcon("img/콜라.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Ex1401();
	}

}
