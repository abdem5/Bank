package Bank;

public class Member {
	private String name;		// �̸�
	private String id;			// ���̵�
	private String pw;			// ��й�ȣ
	private String idNum;		// �ֹε�Ϲ�ȣ (Identification Number)
	private String accNum;		// ���¹�ȣ (Account Number)
	private String phoneNum; 	// ��ȭ��ȣ
	private long money;			// �ܾ�
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String regNum) {
		this.idNum = regNum;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
}

