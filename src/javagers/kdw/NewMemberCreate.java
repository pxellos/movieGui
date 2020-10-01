package javagers.kdw;



import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class NewMemberCreate extends JFrame implements ActionListener,ItemListener{
	JLabel id_new, pwd_new, name_new, birth_new, address_new, gen_new, num_new;
	JTextField id_txt, name_txt, birth_txt, address_txt, gen_txt, num_txt;
	JPasswordField pwd_txt;
	JButton register, cancel;
	JPanel pan_id_new, pan_pwd_new, pan_name_new,pan_birth_new,pan_address_new,
pan_gen_new, pan_num_new, pan_button_new;
	 JComboBox month_com,day_com;
	 
	 JComboBox gen_com;


	public NewMemberCreate(String str) {
    	super(str);
    	this.setLayout(new GridLayout(7,2));
    	
    	//아이디
		id_new = new JLabel("아이디");  //이거는 라벨
		id_txt = new JTextField(10); // 텍스트 필드
		
		
		//비밀번호
		pwd_new = new JLabel("비밀번호"); // 이것도 라벨
		pwd_txt = new JPasswordField(10); 

		
		//이름
		name_new = new JLabel("이름"); 
		name_txt = new JTextField(10); //텍스트 필드

	
		//생년월일
		birth_new = new JLabel("생년월일");
		birth_txt = new JTextField(6);
		month_com = new JComboBox();
		day_com = new JComboBox();
		
		
		
		month_com.addItem("월");
		month_com.addItem("1");
		month_com.addItem("2");
		month_com.addItem("3");
		month_com.addItem("4");
		month_com.addItem("5");
		month_com.addItem("6");
		month_com.addItem("7");
		month_com.addItem("8");
		month_com.addItem("9");
		month_com.addItem("10");
		month_com.addItem("11");
		month_com.addItem("12");
		
		month_com.addItemListener(this);
		



		// 주소
				address_new = new JLabel("주소");
				address_txt = new JTextField(30);
				
				
		// 성별
				
				gen_new = new JLabel("성별");
				gen_com = new JComboBox();
				gen_com.addItem("남자");
				gen_com.addItem("여자");
		
		// 폰번호
				
			   num_new = new JLabel("휴대전화");
			   num_txt = new JTextField(20);
		
	
			   
			   
			   
		pan_name_new = new JPanel(); //이름이 들어갈 패널
		pan_name_new.add(name_new);  //이름을 입력하세요
		pan_name_new.add(name_txt); //빈칸
				
		
		pan_id_new = new JPanel(); // 아이디가 들어갈 패널 
		pan_id_new.add(id_new); // 생성할 아이디를 입력하세요
		pan_id_new.add(id_txt); // 빈칸
		
		
		pan_pwd_new = new JPanel(); //패스워드가 들어갈 패널
		pan_pwd_new.add(pwd_new);  //생성할 비밀번호를 입력하세요.
		pan_pwd_new.add(pwd_txt); //빈칸
		

		pan_birth_new = new JPanel(); // 생일이 들어갈 패널
		pan_birth_new.add(birth_new);
		pan_birth_new.add(birth_txt);
		pan_birth_new.add(month_com);
		pan_birth_new.add(day_com);
		
		
		
		pan_address_new = new JPanel(); // 주소가 들어갈 패널
		pan_address_new.add(address_new);
		pan_address_new.add(address_txt);
		
		
		pan_num_new = new JPanel(); //전화번호가 들어갈 패널
		pan_num_new.add(num_new);
		pan_num_new.add(num_txt);

		
		pan_gen_new = new JPanel(); // 성별이 들어갈 패널
		pan_gen_new.add(gen_new);
		pan_gen_new.add(gen_com);
		
		
		
	
		register = new JButton("회원 가입 완료");  
		
		register.addActionListener(this);
	
		pan_button_new = new JPanel(); //버튼이 들어갈 패널
		pan_button_new.add(register); 
		
		
		
		JPanel sum = new JPanel(); sum.setLayout(new GridLayout(7, 1));
		this.add(pan_id_new); 
		this.add(new JPanel());
		this.add(pan_pwd_new); 
		this.add(new JPanel());
		this.add(pan_name_new);
		this.add(new JPanel());
		this.add(pan_birth_new);
		this.add(new JPanel());
		this.add(pan_address_new);
		this.add(new JPanel());
		this.add(pan_gen_new);
		this.add(pan_button_new);

		this.add(pan_num_new);
	
		
    	this.setSize(1200,800);
     	this.setVisible(true);
	}

	public static void main(String[] args) {
		new NewMemberCreate("My page");

	}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		
		//등록버튼을 눌렀을 경우
		if(obj==register) {
			
		
			
			
			String name = name_txt.getText();
			String id = id_txt.getText();
			String pwd = pwd_txt.getText();
			String address = address_txt.getText();
			String year = birth_txt.getText();
			String month = (String) month_com.getSelectedItem();
			String day = (String) day_com.getSelectedItem();
			String gen = (String) gen_com.getSelectedItem();
			String num = num_txt.getText();
			String birth = year+"/"+month+"/"+day;
			int pnt = 0;
			
			System.out.println("되냐?");
			if(id.equals("")||name.equals("")||pwd.equals("")||address.equals("")
					||year.equals("")||
					month.equals("")||
					day.equals("")||
					gen.equals("")
					||num.equals("")		
					) {//뭔가을 입력하지 않은 경우
				JOptionPane.showMessageDialog(this, 
					"빈칸이 존재하여 작업을 진행할 수 없습니다.");
			}
		
			else {
				

				CRUDprocess crud = new CRUDprocess();
				Customer_info ci = new Customer_info();
				
				ci.setCustomer_name(name);
				ci.setCustomer_id(id);
				ci.setCustomer_pwd(pwd);
				ci.setCustomer_birth(birth);
				ci.setCustomer_addr(address);
				ci.setCustomer_gen(gen);
				ci.setCustomer_num(num);
				ci.setCustomer_pnt(pnt);
				
				
				System.out.println("잘 됐으면 이게 떠야됨");				


				int r = crud.insertCustomer(ci);
				if(r > 0) {
					JOptionPane.showMessageDialog(this, 
							"회원정보가 등록되었습니다.");
				}else {
					JOptionPane.showMessageDialog(this, 
						"회원정보 등록 중 오류가 발생했습니다.");
				}
				}
				//위의 두가지를 통과하면 삽입
			}

			
			}
		

		
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if(obj == month_com) {
			day_com.removeAll();
			day_com.addItem("일");
			//선택한 월을 찾는다.
			int month = month_com.getSelectedIndex();
			//선택한 위치 즉, 첫번째 항목이면 0, 두번째 항목이면 1,,,
			switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				for(int i=1; i<=30; i++) {
					day_com.addItem(i+"");
				}//1부터 30을 채운다.
				break;
			case 2:
				for(int i=1; i<=28; i++) {
					day_com.addItem(i+"");
				}
				break;
			default : 
				for(int i=1; i<=31; i++) {
					day_com.addItem(i+"");
				}
			}
		}
	}}

	
	
	
	
	




