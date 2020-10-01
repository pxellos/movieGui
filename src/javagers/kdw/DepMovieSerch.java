package javagers.kdw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DepMovieSerch extends JPanel{
	Font font;
	JPanel NorthPanel;
	JPanel Main2_1;
	JButton	select2_1,Allselect;
	JLabel[] labels;
	JTextField[] textField;
	String[] label_title= {"영화명","   상영관","   상영기간"," ~ ","  "};
	JComboBox combo1;
	JComboBox combo2;
	Subbutton_Movie sm;
	
	void makeLabel() {
		labels = new JLabel[5];
		for(int i=0; i<labels.length; i++) {
			labels[i] = new JLabel(label_title[i]);//레이블 생성
			labels[i].setFont(font);
		}
	}
	void makeTextField() {
		textField = new JTextField[4];//배열 생성
		for(int i=0; i<textField.length; i++) {
			textField[i] = new JTextField(10);
			textField[i].setFont(font);
		}
	}	
	void init() {
		font = new Font("굴림", Font.BOLD,15);
		NorthPanel = new JPanel();
		Main2_1 = new JPanel();
		select2_1 = new JButton("조회");
		select2_1.setFont(font);
		Allselect = new JButton("전체 조회");
		Allselect.setFont(font);
		Allselect.setBackground(new Color(051,255,000));
		makeLabel(); makeTextField();
		NorthPanel.setPreferredSize(new Dimension(200,60)); 
		combo1 = new JComboBox();
		combo1.addItem("    악인전    ");combo1.addItem("    앤드게임    ");
		combo1.addItem("    피카츄    ");combo1.addItem("    배심원들    ");
		combo2 = new JComboBox();
		combo2.addItem("    1관    ");combo2.addItem("    2관    ");
		combo2.addItem("    3관    ");combo2.addItem("    4관    ");
		NorthPanel.add(labels[0]);
		NorthPanel.add(combo1);
		NorthPanel.add(labels[1]);
		NorthPanel.add(combo2);
		NorthPanel.add(labels[2]);
		NorthPanel.add(textField[2]);
		NorthPanel.add(labels[3]);
		NorthPanel.add(textField[3]);
		NorthPanel.add(labels[4]);

		NorthPanel.add(select2_1);
		NorthPanel.add(Allselect);
	}
	public DepMovieSerch(Subbutton_Movie sm) {
//		super(str);
		this.sm = sm;
		init();
		this.setLayout(new BorderLayout());
		this.add("North", NorthPanel);
		this.add("Center", Main2_1);

//		this.setSize(1200,650); 
//		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
//		new Main2_1("Admin Management");

	}

}