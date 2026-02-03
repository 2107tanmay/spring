package com.service;

import org.springframework.stereotype.Service;

import com.bean.LoginBean;

@Service
public class LoginService {
	
	public boolean validate(LoginBean bean)	{
		if(bean.getUserName().equals(bean.getPassword())) {
			return true;
		}
		return false;
	}
	

}
