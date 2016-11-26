package com.nxd.post;

import java.util.Timer;

public class StartUp
{
	public static void main(String[] args) throws Exception 
	{				
		Timer timer = new Timer();
		timer.schedule(new TimerTaskZhuaqu(),0,30);
	}
}


