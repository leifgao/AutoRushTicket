package com.nxd.post;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDate
{
	public static void main(String[] args) throws Exception
	{
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
