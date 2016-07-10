package com.nxd.post;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPachong 
{
	 //匹配网页上的<div id="showTime">........</div>
	 Pattern pattern = Pattern.compile("<div\\sid=\"showTime\">(.*?)</div>");
	 Matcher matcher = null;
	 
	/**
	 * 
	 * @param myurl 要抓取网站的网址
	 * @return  <div id="showTime">2015年6月15日  13时30分00秒</div>
	 * @throws Exception
	 */
	StringBuffer zhuaqu(String myurl) throws Exception
	{
		URL url = new URL(myurl);  
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));  
		  
		String s = "";  
		  
		StringBuffer sb = new StringBuffer("");  
		  
		while ((s = br.readLine()) != null) 
		{  
			//进行html标签匹配
			matcher = pattern.matcher(s);
			if(matcher.find())
			{
				sb.append(matcher.group());	
			}
		}
		return sb;
	}
}
