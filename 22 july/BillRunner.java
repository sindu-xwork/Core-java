class BillRunner{
      
	  public static void main(String[] generateBill){
	  
	  Bill bill=new Bill();
	  bill.billId=1;
	  bill.billIssueDate="18/7/2024";
	  bill.billDueDate="28/7/2024";
	  bill.isPaidBill=true;
	  bill.isLatestBill=false;
	  System.out.println("The Bill Id is"+ bill.billId);
	  System.out.println("The Bill Issue Date is"+ bill.billIssueDate);
	  System.out.println("The Bill Due Date is"+ bill.billDueDate);
	  System.out.println("The Is Paid Bill is"+ bill.isPaidBill);
	  System.out.println("The Is Latest Bill is"+ bill.isLatestBill);
	  
	  Bill bill2=new Bill();
	  bill2.billId=2;
	  bill2.billIssueDate="18/7/2024";
	  bill2.billDueDate="28/7/2024";
	  bill2.isPaidBill=true;
	  bill2.isLatestBill=false;
	  
	  System.out.println("The Bill Id is"+ bill2.billId);
	  System.out.println("The Bill Issue Date is"+ bill2.billIssueDate);
	  System.out.println("The Bill Due Date is"+ bill2.billDueDate);
	  System.out.println("The Is Paid Bill is"+ bill2.isPaidBill);
	  System.out.println("The Is Latest Bill is"+ bill2.isLatestBill);
	  
	  
	  
	  
	 }
	  
	  }