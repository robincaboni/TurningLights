package com.rc.light;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayLight implements ListLights{
	
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");

	public void run(int numberoflights) throws InterruptedException {
		int count = 0;
        while(true){
        	for(int j=0; j<list_lights.size();j++){
        		//We need to count number of lights
        		//If this number = 2 we'll use only two colors
        		//If this number is bigger than available colors
        		//we'll use all the colors + the difference (the first color if the difference is 1) 
            	if(count==numberoflights){
            		j=0;
            	}
        		System.out.println(sdf.format(new Date().getTime()) + " : " + list_lights.get(j) +" Light On");
            	Thread.sleep(1 * 1000);
            	System.out.println(sdf.format(new Date().getTime()) + " : " + list_lights.get(j) +" Light Off");
            	Thread.sleep(1 * 1000);
            	count++;
        	}
        }
     }

}
