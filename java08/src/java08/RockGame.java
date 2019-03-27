package java08;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class RockGame {
	private static JTextField intro;
	private static JTextField result;
	private static JPanel panel;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton button;
	static int s = 0;
	static int r = 1;
	static int p = 2;
	static int count = 0;
	static int meWin = 0;
	static int computerWin = 0;
	static int noWin = 0;
	
	public static void main(String[] args) {
		//1. 화면
		//2. 액션 처리
		
		JFrame f = new JFrame();
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\limjw\\java08\\s.png"));
		f.setTitle("나의 가위 바위 보 게임");
		f.setSize(800, 500);
		
		intro = new JTextField();
		intro.setFont(new Font("굴림", Font.BOLD, 18));
		intro.setText("가위 바위 보 게임을 시작합니다. 원하는 버튼을 눌러주세요.");
		f.getContentPane().add(intro, BorderLayout.NORTH);
		intro.setColumns(10);
		
		result = new JTextField();
		result.setBackground(Color.YELLOW);
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 26));
		result.setText("아직 게임 시작전입니다.");
		f.getContentPane().add(result, BorderLayout.SOUTH);
		result.setColumns(10);
		
		panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위 바위 보 게임(총 게임 횟수: " + count + "회)");
				
				System.out.println("가위를 선택하셨군요..");
				int me = 0; //가위
				Random random = new Random();
				int computer = random.nextInt(3);
				if(computer == me) { //컴퓨터가 s(가위)
					result.setText("무승부");
					noWin++;
				}else if(computer == r) { //컴퓨터가  r(바위)
					result.setText("컴퓨터가 승리");
					computerWin++;
				}else { //컴퓨터가 p(보)
					result.setText("내가 승리");
					meWin++;
				}
				
				intro.setText(	"내가 승리 횟수: " + meWin + 
						", 컴퓨터가 승리 횟수: " + computerWin + 
						", 무승부: " + noWin);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\limjw\\java08\\s.png"));
		btnNewButton.setBackground(Color.RED);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\limjw\\java08\\r.png"));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위 바위 보 게임(총 게임 횟수: " + count + "회)");
				
				System.out.println("바위를 선택하셨군요..");
				int me = 1; //바위
				Random random = new Random();
				int computer = random.nextInt(3);
				if(computer == me) { //컴퓨터가 r(바위)
					result.setText("무승부");
					noWin++;
				}else if(computer == s) { //컴퓨터가 s(가위)
					result.setText("내가 승리");
					meWin++;
				}else { //컴퓨터가 p(보)
					result.setText("컴퓨터가 승리");
					computerWin++;
				}
				
				intro.setText(	"내가 승리 횟수: " + meWin + 
								", 컴퓨터가 승리 횟수: " + computerWin + 
								", 무승부: " + noWin);
			}
		});
		panel.add(btnNewButton_1);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위 바위 보 게임(총 게임 횟수: " + count + "회)");
				System.out.println("보를 선택하셨군요..");
				int me = 2; //보
				Random random = new Random();
				int computer = random.nextInt(3);
				if(computer == me) { //컴퓨터가 p(보)
					result.setText("무승부");
					noWin++;
				}else if(computer == s) { //컴퓨터가  s(가위)
					result.setText("컴퓨터가 승리");
					computerWin++;
				}else { //컴퓨터가 r(바위)
					result.setText("내가 승리");
					meWin++;
				}
				
				intro.setText(	"내가 승리 횟수: " + meWin + 
						", 컴퓨터가 승리 횟수: " + computerWin + 
						", 무승부: " + noWin);
			}
		});
		button.setIcon(new ImageIcon("D:\\limjw\\java08\\p.png"));
		button.setBackground(Color.PINK);
		panel.add(button);
		
		f.setVisible(true);	
	}
}
