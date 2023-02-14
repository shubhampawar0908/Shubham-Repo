package OOPConcept;

public class Bank {

		
		String bankName;
		String bankAdress;
		String bankType;
		int accounts;
		

		public static void main(String[] args) {
			Bank b1=new Bank();
			b1.bankName="Bank of Baroda";
			b1.bankAdress="Karad";
			b1.bankType="public sector bank";
			b1.accounts=12344555;
			
			System.out.println("Name of the Bank= "+b1.bankName);
			System.out.println("Address of the Bank= "+b1.bankAdress);
			System.out.println("Type of the Bank= "+b1.bankType);
			System.out.println("NO. of Accounts in the Bank= "+b1.accounts);
			
		// TODO Auto-generated method stub

	}

}
