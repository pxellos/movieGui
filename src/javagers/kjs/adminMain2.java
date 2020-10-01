package javagers.kjs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class adminMain2 extends JFrame implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == movie) {
			Main2.setVisible(true);
			
		} 
	}
	JPanel Panels; 
	JPanel Main1,Main2,Main3,Main4;
	JButton custom, movie, sales, book;
	Font font;
	JPanel subPanel1, subPanel2, subPanel3;
	JButton cselect, cupdate, cdelete, 
			mselect, mset, mregister, mupdate,
			rtselect, rpselect, rregister;
	void init() {
		font = new Font("굴림",Font.BOLD,20);
		Panels = new JPanel();
		Main1 = new JPanel();
		Main2 = new JPanel();
		Main3 = new JPanel();
		Main4 = new JPanel();
		custom = new JButton("회원 관리");
		movie = new JButton("영화 관리");
		sales = new JButton("매출 관리");
		book = new JButton("예매 현황");
		subPanel1 = new JPanel();
		subPanel2 = new JPanel();
		subPanel3 = new JPanel();
		cselect = new JButton("회원 조회");
		cupdate = new JButton("회원 수정");
		cdelete = new JButton("회원 삭제");
		mselect = new JButton("영화 목록 조회");
		mset = new JButton("상영관 설정");
		mregister = new JButton("영화 등록");
		mupdate = new JButton("영화 변경/삭제");
		rtselect = new JButton("테이블 조회");
		rpselect = new JButton("현황판 조회");
		rregister = new JButton("현장 등록");
		custom.setFont(font);
		movie.setFont(font);
		sales.setFont(font);
		book.setFont(font);
		cselect.setFont(font);
		cupdate.setFont(font);
		cdelete.setFont(font);
		mselect.setFont(font);
		mset.setFont(font);
		mregister.setFont(font);
		mupdate.setFont(font);
		rtselect.setFont(font);
		rpselect.setFont(font);
		rregister.setFont(font);
		Panels.setLayout(new GridLayout(1,4));
		Panels.add(custom);
		Panels.add(movie);
		Panels.add(sales);
		Panels.add(book);
		
		subPanel2.setLayout(new GridLayout(1,4));
		subPanel2.add(mselect);
		subPanel2.add(mset);
		subPanel2.add(mregister);
		subPanel2.add(mupdate);
		mselect.setBackground(new Color(235,235,90));
		mset.setBackground(new Color(235,235,90));
		mregister.setBackground(new Color(235,235,90));
		mupdate.setBackground(new Color(235,235,90));
		movie.addActionListener(this);
		
		Panels.setPreferredSize(new Dimension(200,60));  // 패널 크기조절
		subPanel2.setPreferredSize(new Dimension(1200,60) );
	}
	public adminMain2(String str) {
		super(str);
		init();
		this.setLayout(new BorderLayout());
		Panels.setBackground(java.awt.Color.RED);
		this.add("North", Panels);
		this.add("Center", Main2);
		
		Main2.add("North",subPanel2);
		Main2.setVisible(false);
		this.setSize(1200,800); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new adminMain2("Admin Management");

	}
}
