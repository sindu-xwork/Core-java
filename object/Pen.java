class Pen{

  String name;
  int id;
  String color;
  double price;
  
public Pen(String name,int Id,String color,double price){
	this.name=name;
	this.id=id;
	this.color=color;
	this.price=price;
}
public void getPenDetails(){
	
System.out.println("The Name is"+ this.name);
System.out.println("The Id is"+ this.id);
System.out.println("The Color is"+ this.color);
System.out.println("The Price is"+ this.price);
	
	
}
 
}