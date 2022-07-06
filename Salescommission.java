 /* sales           commission
 below 20000           0%
 20000 - 25000        10%
 above 25000          20%  */

                       
 
public class Salescommission {
	int myempid;
	String myempname;
	double mytsales,mycommissionrate,mytsalescommission;
	
	
	
	public Salescommission( int empid,String empname) {
		myempid =empid;
		myempname = empname;
	        mytsales =0.00;
		mycommissionrate=0.00;
		mytsalescommission=0.00;
		
		
		
		
		
	}
	public void settsales(double tsales) {
		
		mytsales=tsales;
	}
	
	
	public void setcommissionrate() {
		
		if(mytsales< 20000.00) {
			
			mycommissionrate=0.00;
			
		}
		else if(mytsales>=20000.00 &&  mytsales<=25000.00) {
			
			mycommissionrate=0.10;
			
			
		}
		
		else {
			
			mycommissionrate=0.20;
			
		}
		
	}
			
		
		public void settsalescommission() {
			mytsalescommission = mytsales*mycommissionrate;
			
		}
		
		
		public double gettsales() {
			return mytsales;
		}
		
		
		
		
		public double getcommissionrate() {
			
			return mycommissionrate;
		}
		
		
		
		
		public double gettsalescommission() {
			
			return mytsalescommission;
			
		
		}
		
	}


