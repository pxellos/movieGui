package javagers.jjy;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javagers.jjy.CRUDprocess;


public class MyPageInfoChangePanel extends JPanel implements ActionListener,ItemListener{
	JLabel id_new, pwd_new, name_new, birth_new, address_new, gen_new, num_new;
	JTextField id_txt, name_txt, pwd_txt, birth_txt, address_txt, gen_txt, num_txt;
	JButton update, cancel, select;
	JPanel pan_id_new, pan_pwd_new, pan_name_new,pan_birth_new,pan_address_new,
	pan_gen_new, pan_num_new, pan_button_new;
	JComboBox month_com,day_com;
	JComboBox gen_com;
	
	private JButton deleteid;

	public MyPageInfoChangePanel() {
    	this.setLayout(new GridLayout(9,1));
    	
    	//이름
		name_new = new JLabel("이름"); 
		name_txt = new JTextField(10);
    	
    	//아이디
		id_new = new JLabel("아이디");  //이거는 라벨
		id_txt = new JTextField(10); // 텍스트 필드
		
		//비밀번호
		pwd_new = new JLabel("비밀번호"); 
		pwd_txt = new JTextField(10); 
	
		//생년월일
		birth_new = new JLabel("생년월일");
		birth_txt = new JTextField(6);
		month_com = new JComboBox();
		day_com = new JComboBox();
		
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
		
		pan_id_new = new JPanel(); // 아이디가 들어갈 패널 
		pan_id_new.add(id_new); // 생성할 아이디를 입력하세요
		pan_id_new.add(id_txt); // 빈칸
		
		
		pan_pwd_new = new JPanel(); //패스워드가 들어갈 패널
		pan_pwd_new.add(pwd_new);  //생성할 비밀번호를 입력하세요.
		pan_pwd_new.add(pwd_txt); //빈칸
		
		pan_name_new = new JPanel(); //이름이 들어갈 패널
		pan_name_new.add(name_new);  //이름을 입력하세요
		pan_name_new.add(name_txt); //빈칸
		
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
	
		select = new JButton("Search");
		String imgPath1 = "src\\javagers\\image\\searchButtonBlack.jpg";
		ImageIcon originIcon1 = new ImageIcon(imgPath1);
		Image originImg1 = originIcon1.getImage();
		Image changedImg1 = originImg1.getScaledInstance(22, 17, Image.SCALE_SMOOTH );
		ImageIcon Icon1 = new ImageIcon(changedImg1);
		select.setIcon(Icon1);
		select.setForeground(Color.white);
		select.setBackground(Color.black);
		
		update = new JButton("Modify");  
		String imgPath2 = "src\\javagers\\image\\vcheckButtonBlack.jpg";
		ImageIcon originIcon2 = new ImageIcon(imgPath2);
		Image originImg2 = originIcon2.getImage();
		Image changedImg2 = originImg2.getScaledInstance(22, 17, Image.SCALE_SMOOTH );
		ImageIcon Icon2 = new ImageIcon(changedImg2);
		update.setIcon(Icon2);
		update.setForeground(Color.white);
		update.setBackground(Color.black);
		
		deleteid = new JButton("Withdraw");
		String imgPath3 = "src\\javagers\\image\\withDrawButtonBlack.jpg";
		ImageIcon originIcon3 = new ImageIcon(imgPath3);
		Image originImg3 = originIcon3.getImage();
		Image changedImg3 = originImg3.getScaledInstance(22, 17, Image.SCALE_SMOOTH );
		ImageIcon Icon3 = new ImageIcon(changedImg3);
		deleteid.setIcon(Icon3);
		deleteid.setForeground(Color.white);
		deleteid.setBackground(Color.black);
		
		update.addActionListener(this);
		select.addActionListener(this);
		deleteid.addActionListener(this);
		
		pan_button_new = new JPanel(); //버튼이 들어갈 패널
		pan_button_new.add(select);
		pan_button_new.add(update); 
		pan_button_new.add(deleteid);
		
		JPanel sum = new JPanel(); sum.setLayout(new GridLayout(7, 1));
		this.add(pan_id_new); 
		this.add(pan_pwd_new); 
		this.add(pan_name_new);
		this.add(pan_birth_new);
		this.add(pan_address_new);
		this.add(pan_gen_new);
		this.add(pan_num_new);
		this.add(pan_button_new);
		
    	this.setSize(1200,800);
     	this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CRUDprocess crud = new CRUDprocess();
		
		Object obj = e.getSource();
		String name = name_txt.getText();
		String id = id_txt.getText();// 입력한 아이디를 저장
		String pwd = pwd_txt.getText();
		String address = address_txt.getText();
		String year = birth_txt.getText();
		String month = (String) month_com.getSelectedItem();
		String day = (String) day_com.getSelectedItem();
		String gen = (String) gen_com.getSelectedItem();
		String num = num_txt.getText();
		String birth = year+"/"+month+"/"+day;
		
		//나의 정보 보기버튼을 눌렀을 경우
		if(obj == select) {
			
			Customer_Info ci =crud.selectCustomerInfo(id);

			if(id.equals("")) {
				JOptionPane.showMessageDialog(this, "확인을 위해 본인의 아이디를 입력하세요");
			}
			
			else {
			//아이디로 나의 정보 보기
				if(ci == null) {//나의 정보 보기 결과가 없는 경우
					JOptionPane.showMessageDialog(this, 
						"입력한 아이디는 존재하지 않습니다.");
			}
				else {//나의 정보 보기 결과가 있는 경우
					name_txt.setText(ci.getCustomer_name());//이름 세팅
					id_txt.setText(ci.getCustomer_id());//아이디 세팅
					pwd_txt.setText(ci.getCustomer_pwd());//비밀번호 세팅
					
				
				String [] birthday = ci.getCustomer_birth().split("/");
				
				birth_txt.setText(birthday[0]);
				month_com.setSelectedItem(birthday[1]);
				day_com.setSelectedItem(birthday[2]);
					
				address_txt.setText(ci.getCustomer_addr());
				gen_com.setSelectedItem(ci.getCustomer_gen());
				num_txt.setText(ci.getCustomer_num());	
				}
		}
	}
		//수정버튼을 눌렀을 경우
		else if(obj==update) {
			
			if(id.equals("")||name.equals("")||pwd.equals("")||address.equals("")
					||year.equals("")||month.equals("")||day.equals("")||gen.equals("")
					||num.equals("")		
					) {//뭔가을 입력하지 않은 경우
				JOptionPane.showMessageDialog(this, 
					"빈칸이 존재하여 작업을 진행할 수 없습니다.");
			} else {
				int result = JOptionPane.showConfirmDialog(this, "정말로 변경하시겠습니까?","작업 확인",
					JOptionPane.YES_NO_OPTION);
			//예스를 눌렀을 경우
			if(result == JOptionPane.YES_OPTION) {
				Customer_Info customer_info=new Customer_Info();
				customer_info.setCustomer_name(name);
				customer_info.setCustomer_id(id);
				customer_info.setCustomer_pwd(pwd);
				customer_info.setCustomer_birth(birth);
				customer_info.setCustomer_addr(address);
				customer_info.setCustomer_gen(gen);
				customer_info.setCustomer_num(num);	
				
				int r = crud.updateCustomerInfo(customer_info);	//DB update
				if(r > 0) {
					JOptionPane.showMessageDialog(this, "완벽하게 수정되었습니다.");				
				} else {
					JOptionPane.showMessageDialog(this, "ID는 변경하실 수 없습니다.");
				}
			}
		}
	} else if (obj == deleteid) {		//삭제버튼을 누른 경우
			//버튼이 2개 있는 다이얼로그를 출력한다.	ex) 예/아니오
		int result = JOptionPane.showConfirmDialog(this, "※ 정말 탈퇴하시겠습니까?"
				, "삭제 확인",
				JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			//DB에서 삭제작업을 진행
			String Id = id_txt.getText();	//아이디를 찾아 저장
			if(Id.equals("")) {	//아이디가 없는 경우
				JOptionPane.showMessageDialog(this, "ID가 없어서 작업을 진행할 수 없습니다.");
			} else {	//DB에서 해당 아이디를 삭제
				CRUDprocess crud2 = new CRUDprocess();
				int r = crud2.deleteCustomerID(Id);
				if(r > 0) {
					JOptionPane.showMessageDialog(this, "해당 회원정보가 삭제되었습니다.");
				} else {
					JOptionPane.showMessageDialog(this, "회원정보 삭제 중 문제가 발생했습니다.");
				}
				
			}
		} else if(result == JOptionPane.NO_OPTION) {
			//No일땐 가만히 놔둠
		}
	}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if(obj == month_com) {//입사월을 선택한 경우
			//기존에 저장된 입사일을 지운다.
			day_com.removeAll();
			day_com.addItem("입사일");
			//선택한 월을 찾는다.
			int month = month_com.getSelectedIndex();
			//선택한 위치 즉, 첫번째 항목이면 0, 두번째 항목이면 1,
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

	
	
	
	
	




