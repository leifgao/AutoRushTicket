package com.nxd.post;


public class TimerTaskTest extends java.util.TimerTask
{
	public void run()
	{
		
		String s = TestGetPost.sendPost(
				"http://202.195.237.169:8080/quhao/getNumber.jsp",
				"id=002372&name=陈北京&tele=15951862571&type=项目经费");
		System.out.println(s);
	}
}
