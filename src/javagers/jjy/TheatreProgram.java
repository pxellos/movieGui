package javagers.jjy;

import java.util.InputMismatchException;

public class TheatreProgram {
	
	private int choice;
	private TheatreManage manage;
	
	
	public TheatreProgram() {
		this.manage = new TheatreManage();
	}
	
	public int getChoice() {
		return choice;
	}

	public void setChoice() {
		while(true){
			try{
				this.choice = manage.inputScannerInt();
				break;
			}
			catch(InputMismatchException ime){
				System.out.println("1�Ǵ� 2�� �Է����ּ���.");
			}
		}
	}

	public void startProgram() {
		manage.createSeats();
		while(true) {
			System.out.println("=================");
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("=================");
			
			this.setChoice();
			choice = this.getChoice();
			
			if ( choice == 1){
				manage.reservationSeats();
			}
			else if ( choice == 2){
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			else {
				System.out.println("1�Ǵ� 2�� �Է����ּ���.");
			}
		}
		
	}

}

