package edu.corejava;

public class SwitchCase {
	public static void main(String args[]){
	     int num=2;
	     switch(num+2)
	     {
	        case 1:
		  System.out.println("Case1: Value is: "+num);
		case 2:
		  System.out.println("Case2: Value is: "+num);
		case 3:
		  System.out.println("Case3: Value is: "+num);
		case 4:
			System.out.println("Case4: Value is:"+num);// doubt even if case4 executes why default is also executing//
	        default:
		  System.out.println("Default: Value is: "+num);
	      }
	   }
}
