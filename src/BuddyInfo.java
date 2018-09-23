public class BuddyInfo {
	private String name;
	private String addr;
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo  buddyInfo = new BuddyInfo();
		buddyInfo.setName("Beck");
		buddyInfo.setAddr("1551 Riverside Dr, Ottawa");
		
		System.out.println("Hello "+buddyInfo.getName()+". Welcome to the world!");
		System.out.println("Are you living at " + buddyInfo.getAddr()+"?");
		System.out.println("Hello "+buddyInfo.getName()+". Welcome to the world!");
		System.out.println("Are you living at " + buddyInfo.getAddr()+"?");
	}

	
}
