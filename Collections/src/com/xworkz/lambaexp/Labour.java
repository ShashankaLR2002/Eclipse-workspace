package com.xworkz.lambaexp;

public class Labour {
  
	public void work(Starter starter)
  {
	  
	  if (starter != null)
	  {
		  starter.on();
	  }
	  else {
		  System.out.println("starter is null");
	  }
  }
  
	}
	
