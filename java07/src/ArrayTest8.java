import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest8 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� �׸�");
		JLabel l = new JLabel(); //����
		f.add(l);
		
		ImageIcon icon = new ImageIcon("ham2.jpg");//�̹���
		l.setIcon(icon);
		
		f.setSize(800, 800);
		f.setVisible(true);
	}
}
