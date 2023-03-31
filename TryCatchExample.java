package Payilagam;
public class TryCatchExample {
	   public static void main(String[] args) {
			Example ex =new Example();
	        ex.display();
	        }
	    public void display() {
	        try{
	        	int num = 45/0;
	        	System.out.println(num);
	        	System.out.println("number printing");
	           }
	         catch(Exception rum){
	        	 System.out.println("this is catch block");
	        	 }
	         finally{
	        	 System.out.println("this is finally block");
	         }
		}
	}

