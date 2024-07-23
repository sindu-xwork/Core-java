class HomeStay {
    int areaInSft;
    String propertyName;
    String ownerName;
    int noOfRooms;

    public boolean createHomeStay(int areaInSft, String propertyName, String ownerName, int noOfRooms) {
		 
		 boolean isHomeStayCreated=false;
  if( areaInSft!>0 && propertyName!>null && ownerName!=null && noOfRooms>0){
	  
        this.areaInSft = areaInSft;
        this.propertyName = propertyName;
        this.ownerName = ownerName;
        this.noOfRooms = noOfRooms;
		isHomeStayCreated=true;
  }
  
  return isHomeStayCreated;
  
    }

    public void enjoy() {
        System.out.println("Welcome to " + this.areaInSft);
        System.out.println("Managed by " + this.propertyName);
        System.out.println("This homestay has " + this. ownerName);
        System.out.println("It covers an area of " + this.noOfRooms);
        
    }
}
