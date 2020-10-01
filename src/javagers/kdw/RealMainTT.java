package javagers.kdw;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.BoldAction;


public class RealMainTT extends JFrame implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		if(obj == correct) {
			this.card.show(slide, "correct");
		} 
		 else if(obj == notUserSearch) {
			this.card.show(slide, "ni");
		} 
	
	}
	
	CardLayout card;
	JPanel slide, btnn;
	JButton correct,Mypage,notUserSearch,login;
	MyPageInfoChangePanel mpic;
	NotUserReserveSearch notUserSearch_info;

	
	public RealMainTT() {
//		super(str);
		this.setLayout(new BorderLayout());
		card = new CardLayout();
		slide = new JPanel();
		slide.setLayout(card);
		btnn = new JPanel();
		correct = new JButton("회원정보 수정");
		correct.addActionListener(this);
		
	
		
		notUserSearch = new JButton("예매조회");
		notUserSearch.addActionListener(this);
		login = new JButton();
		login.setText("로그인");
		login.addActionListener(this);
		btnn.setLayout(new GridLayout(1,4));
		btnn.add(correct);
		btnn.add(notUserSearch);
	
		btnn.setPreferredSize(new Dimension(100, 80));
		
		mpic = new MyPageInfoChangePanel();
		notUserSearch_info = new NotUserReserveSearch();
	
		slide.add(mpic,"correct");
		slide.add(notUserSearch_info,"ni");

		
		this.add("North",btnn);
		this.add("Center",slide);
		this.setSize(1200,800); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new RealMainTT();
	}
	

}



