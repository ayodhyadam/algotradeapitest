package com.gyantey.uamapi.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.gyantey.uamapi.dao.LoginDao;

import com.gyantey.uamapi.service.LoginService;

@Repository
public class LoginRepository {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private  LoginDao loginDao;
	
	public boolean varifyLoginInfoRepository(String userid, String password)
	{
		System.out.println("repos is called");
		String query=loginDao.makeLoginQuery( userid, password);
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(query);
		System.out.println("service is finished");
		return queryForList.size()==1?true:false;
	}
	
	
	
	

}
