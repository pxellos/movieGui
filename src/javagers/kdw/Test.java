package javagers.kdw;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == custom) {
			totalPanel.setVisible(true);
			this.card.show(totalPanel, "custom");
						
		} else if(o == movie) {
			totalPanel.setVisible(true);
			this.card.show(totalPanel, "movie");
		} else if(o == sales) {
			totalPanel.setVisible(true);
			this.card.show(totalPanel, "sales");
		} else if(o == book) {
			totalPanel.setVisible(true);
			this.card.show(totalPanel, "book");
		}
		
	}
	JPanel Panels;
	JButton custom, movie, sales, book;
	CardLayout card;
	JPanel totalPanel;
	JPanel Main1,Main2,Main3,Main4;
	Font font;
	Subbutton_Custom subbutton_custom;
	Subbutton_Movie subbutton_movie;
	Subbutton_SalesTable subbutton_sales;
	Subbutton_Reserve subbutton_book;
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
		custom.setFont(font);
		movie.setFont(font);
		sales.setFont(font);
		book.setFont(font);
		Panels.setLayout(new GridLayout(1,4));
		Panels.add(custom);
		Panels.add(movie);
		Panels.add(sales);
		Panels.add(book);
		custom.addActionListener(this);
		movie.addActionListener(this);
		sales.addActionListener(this);
		book.addActionListener(this);

		card = new CardLayout();
		totalPanel = new JPanel();
		totalPanel.setLayout(card);
		subbutton_custom = new Subbutton_Custom(this);
		subbutton_movie = new Subbutton_Movie(this);
		subbutton_sales = new Subbutton_SalesTable(this);
		subbutton_book = new Subbutton_Reserve(this);
		totalPanel.add(subbutton_custom,"custom");
		totalPanel.add(subbutton_movie,"movie");
		totalPanel.add(subbutton_sales,"sales");
		totalPanel.add(subbutton_book,"book");
		Panels.setPreferredSize(new Dimension(200,60));  // 패널 크기조절
		Main1.setPreferredSize(new Dimension(1200,60));
		Main2.setPreferredSize(new Dimension(1200,60));
		Main4.setPreferredSize(new Dimension(1200,60));
		
	}
	public Test(String str) {
		super(str);
		init();
		this.setLayout(new BorderLayout());
		Panels.setBackground(java.awt.Color.RED);
		this.add("North", Panels);
		this.add("Center", totalPanel);
		totalPanel.setVisible(false);
		
		this.setSize(1200,800); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test("Admin Management");

	}

}