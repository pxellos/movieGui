package javagers.jjy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TheatreManage {

	private static Map<Integer, List<String>> seats;
	private Scanner input;
	private List<String> seat;
	
	public TheatreManage(){
		this.seats = new HashMap<Integer, List<String>>();
		this.input = new Scanner(System.in);
	}

	public Map<Integer, List<String>> getSeats() {
		return seats;
	}

	public void setSeats(Map<Integer, List<String>> seats) {
		this.seats = seats;
	}
	
	/** 
	 * Scanner�Լ�
	 * @return
	 */
	public String inputScanner() {
		input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public int inputScannerInt(){
		input = new Scanner(System.in);
		return input.nextInt();
	}
	
	/**
	 * �ʱ� �¼� ����
	 * @return
	 */
	public Map<Integer, List<String>> createSeats() {
		for ( int j = 0; j < 5; j++){
			this.seat = new ArrayList<String>();
			for( int i = 0; i < 10; i++ ) {
				seat.add("��");
			}
			seats.put(j,seat);
		}
		return seats;
	}
	
	/**
	 * �¼� ���
	 */
	public void printSeats() {
		for ( int i = 0; i < 5; i++ ){
			this.seat = this.seats.get(i);
			for ( String s : seat ) {
				System.out.print(s);
			}
			System.out.println("");
		}
	}
	
	/**
	 * ����
	 */
	public void reservationSeats() {
		//seatNum �̾Ƴ���
		System.out.println("������ �¼��� (x,y)�������� �Է��ϼ���.(x��° �� y��° �ڸ�)");
		printSeats();
		System.out.println("10ĭ�� 5���� �¼��ִ�.");
		
		String seatNum = inputScanner();
				
		seatNum = seatNum.trim();
		
		seatNum = seatNum.replace(" ", ""); 
		
		String seatNumbers[] = seatNum.split(","); 
		
		int row = Integer.parseInt(seatNumbers[0]);
		int col = Integer.parseInt(seatNumbers[1]);
		
		// �������� �ʴ� �¼��� �Է��ߴٸ� return���� �Լ�����������?
		if ( checkRowCol(row) || checkRowCol(col)){
			System.out.println("�������� �ʴ� �¼��Դϴ�.");
			return;
		}
		
		 //�¼��� �̹� ���� ����� üũ
		for (int i = 0; i < 5; i++) {
			List<String> checkList = getSeats().get(row-1);
			for ( String s : checkList ){
				if (checkList.get(col-1).equals("��") ){
					System.out.println("�̹� ����� �ڸ��Դϴ�.");
					printSeats();
					return; // �Ǿ��ٸ� return���� �Լ�����������?
				}
			}
		}
		
		// �ȵ��¼��̶�� ���� 
		List<String> selectedSeats = getSeats().get(row-1);
		selectedSeats.set(col-1, "��");
		
		System.out.println(row + "��° �� " + col + "��° �ڸ��� ����Ǿ����ϴ�.");
		printSeats();
		
	}
	
	// �����ȿ� �Է¹��� �¼� ���ڰ� �³�
	public boolean checkRowCol (int num){
		if ( num <= 0 || num >= 10){
			return true;
		}
		else {
			return false;
		}
	}

}
