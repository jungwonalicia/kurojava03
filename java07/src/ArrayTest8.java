import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest8 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 그림");
		JLabel l = new JLabel(); //글자
		f.add(l);
		
		ImageIcon icon = new ImageIcon("ham2.jpg");//이미지
		l.setIcon(icon);
		
		f.setSize(800, 800);
		f.setVisible(true);
	}
}
