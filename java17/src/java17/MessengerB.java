package java17;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.awt.event.ActionEvent;

public class MessengerB extends JFrame{
	JTextField input;
	JTextArea list;
	DatagramSocket socket; 
	
	public MessengerB() throws Exception {
		socket = new DatagramSocket(5000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		input = new JTextField();
		list = new JTextArea();
		
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				//엔터 넣기
				list.append("ME>> " + data + "\n");
				//입력값 클리어
				input.setText("");
				
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data2 = data.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					
					//2. UDP패킷필요
					DatagramPacket packet 
					= new DatagramPacket(data2, data2.length, ip, 6000);
					
					socket.send(packet);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		input.setFont(new Font("Monospaced", Font.BOLD, 60));
		input.setBackground(Color.GREEN);
		input.setForeground(Color.BLUE);
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(20);
		
		list.setEditable(false);
		list.setBackground(Color.MAGENTA);
		list.setForeground(Color.BLACK);
		list.setFont(new Font("Monospaced", Font.BOLD, 60));
		list.setRows(6);
		list.setColumns(20);
		getContentPane().add(list, BorderLayout.CENTER);
		pack();
		
		setVisible(true);
		
	}
	
	public void process() throws Exception { //받는 기능만 수행.
		while(true) {
			
			byte[] data = new byte[256];
			
			DatagramPacket packet 
				= new DatagramPacket(data, data.length);
			
			socket.receive(packet);
			String data2 = new String(data);
			list.append("YOU>> " + data2 + "\n");
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessengerB m = new MessengerB();
		m.process();		
	}

}
