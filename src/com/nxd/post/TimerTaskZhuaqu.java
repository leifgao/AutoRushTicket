package com.nxd.post;

import java.util.Timer;

public class TimerTaskZhuaqu extends java.util.TimerTask
{
	int shi;
	int fen;
	int miao;
	boolean flag = true;

	public void run() 
	{
		//抓取报账系统的网页
		StringBuffer sb;
		try {
			sb = new TestPachong().zhuaqu("http://202.195.237.169:8080/quhao/index.jsp");
			System.out.println(sb);
			//分别获取时分秒
			int shi  =  new Integer(sb.substring(30, 32));
			int fen  =  new Integer(sb.substring(33,35));
			int miao =  new Integer(sb.substring(36, 38));
			
			//当时间为13.30.00时，返回true；
			if(shi==13&fen==30&miao==0)
			{
				cancel();
				Timer timer = new Timer();
				timer.schedule(new TimerTaskTest(), 20,2000);
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	}

}
