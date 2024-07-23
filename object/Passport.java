class Passport{
    //method
	
	class Passport{
	static String cprlocation;
	static int dcdrlocation;
	static String surname;
	static String givename;
	static String dob;
	static String email;
	static boolean isEmaiLoginSame;
	static String loginId;
	static String password;
	static String confirmpwd;
	static String hintQuen;
	static String hintAns;
	static String captcha;
	
	
public boolean createPassport(String cprlocation,int dcdrlocation, String surname,String givenName,
String dob,String email,boolean isEmaiLoginSame,String loginId,
String password, String confirmpwd,String hintQuen,String hintAns,String captcha){
boolean isPassportDataCreated=false;



if(cprlocation !=null && dcdrlocation >=0 && surname !=null && givenName !=null && dod !=null && email !=null && isEmaiLoginSame !=null
	&& loginId !=null && password !=null && confirmpwd !=null && hintQues !=null && hintAns !=null && captcha null){
	this.cprlocation = cprlocation;
	this.dcdrlocation = dcdrlocation;
	this.surname = surname ;
	this.given = givenName;
	this.dob = dob;
	this.email = email;
	this.isEmaiLoginSame = isEmaiLoginSame;
	this.loginId = loginId;
	this.password = password;
	this.confirmpwd = confirmpwd;
	this.hinQuens = hintQuen;
	this.hinAns = hintAns;
	this.captcha = captcha;
	
	isPassportDataCreated=true;
	}
	else{
		System.out.println("Seems like some of the infromation are INVALID!! please enter correct details");
	}
return isPassportDataCreated;


}
		public static void getPassportRedoDetails(){
			
			System.out.println("The CPR Location is 			:  		" + cprlocation );
		System.out.println("The Dcdr Location is 			:  		" + dcdrlocation );
		System.out.println("The Surname  is 			:  		" + surname );
		System.out.println("The Given Name  is 			:  		" + given );
		System.out.println("The Date of Birth is 			:  		" + dob );
		System.out.println("The email is 				:  		" + email );
		System.out.println("The given is sam as loginId is 		: 		" + isEmaiLoginSame);
		System.out.println("The Loginn ID is 			:  		" + loginId );
		System.out.println("The Password is 			:  		" + password );
		System.out.println("The confrimed Pwd is 			:  		" + confirmpwd );
		System.out.println("The security hint question is		: 		" + hinQuen );
		System.out.println("The security hint answer  is 		: 		" + hinAns );
		System.out.println("The entred captcha code is 		:  		" + captcha );
		
		
		}



}