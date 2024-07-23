class AccountDetail{

    int customerId;
	String bankName;
	String branchName;
	String ifscCode;
	long accountNumber;
	String address;
	String accounttype;
	public AccountDetail(){
	System.out.println("AccountDetails is create");

	}
	
	
	public AccountDetail(int customerId,String bankName,String branchName,String ifscCode,long accountNumber,String address,
	          String account){
			  
    this.customerId = customerId;
	this.bankName = bankName;
	this.branchName = branchName;
	this.ifscCode = ifscCode;
	this.accountNumber = accountNumber;
	this.address = address;
	this.accounttype = accounttype;	  
			  
			  }
			  
			  
			  
	public void getAccountDetail(){
	System.out.println("The Customer Id is"+ this.customerId);
	System.out.println("The Bank Name is"+ this.bankName);
	System.out.println("The Branch Name is"+ this.branchName);
    System.out.println("The IFSC Code is"+ this.ifscCode);
    System.out.println("The Account Number is"+ this.accountNumber);
	System.out.println("The Adderss is"+ this.address);
	System.out.println("TheAccount Type is"+ this.accounttype);
			  }
			  
			  }
	












