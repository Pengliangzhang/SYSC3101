import java.util.LinkedList;

public class AddressBook {
	//field for the class
	LinkedList<BuddyInfo> list = new LinkedList<BuddyInfo>();
	
	
	public void addBuddy(String name, String addr){
		BuddyInfo  buddy = new BuddyInfo();
		buddy.setName(name);
		buddy.setAddr(addr);
		list.push(buddy);
	} 
	
	public BuddyInfo removeBuddy(String name){
		BuddyInfo deletBuddy=null;
		for(BuddyInfo boddy: list){			
			if(boddy.getName()==name) {
				deletBuddy=boddy;
				list.remove(boddy);
				System.out.println("The system removed: " + deletBuddy.getName()+"'s information.");
				break;
			}
		}
		return deletBuddy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AddressBook");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy("Beck", "1833 Riveriside");
		addressBook.removeBuddy("Beck");
		addressBook.addBuddy("Zhang", "1833 Riveriside");
		addressBook.removeBuddy("Zhang");
		addressBook.addBuddy("BeckZ", "123 Riverside Dr");
	}

}
