package com.login.app.service.impl;

import com.login.app.service.LoginService;
import com.student.exception.BusinessException;
import com.login.app.model.User;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b = false;
		if (user != null && user.getUsername() != null && user.getPassword() != null
				&& user.getUsername().equals("admin")
				&& user.getPassword().equals("admin@123")) {
			b=true;
		}else {
			throw new BusinessException("Invalid Username/Password... Kindly Re-Enter");
		}
		return b;
	}

}
