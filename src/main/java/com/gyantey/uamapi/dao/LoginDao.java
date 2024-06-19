package com.gyantey.uamapi.dao;

import org.springframework.stereotype.Component;

@Component
public class LoginDao {
	
	
	public String makeLoginQuery(String userid,String password)
	{
		StringBuffer sb=new StringBuffer();
		sb.append("select * from userinfo where userid='");
		if(!userid.isEmpty())
		{
			sb.append(userid+"'");
		}
		if(!password.isEmpty())
		{
			sb.append(password+"'");
		}
		sb.append(";");
		

		return  sb.toString();
	}

}
