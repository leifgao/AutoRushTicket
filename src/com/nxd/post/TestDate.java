package com.nxd.post;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDate
{
	public static void main(String[] args) throws Exception
	{
//		Date d1 = new Date();
//		System.out.println(d1);
//		Date d2 = new Date(System.currentTimeMillis()+100000);
//		System.out.println(d2);
		
//		
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.get(YEAR));
//		System.out.println(c.get(MONTH));
//		System.out.println(c.get(DATE));
//		System.out.println(c.get(HOUR));
//		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = df.parse("2014-10-29 13:29:51");
		boolean flag = true;
		while(flag)
		{
			Date d2 = df.parse(df.format(new Date()));
			if( d1.getTime() == d2.getTime() )
			{
				System.out.println("相等");
				flag = false;
			}
		}
	}
}
