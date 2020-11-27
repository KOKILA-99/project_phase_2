package com.login.app.service;

import com.login.app.model.User;
import com.student.exception.BusinessException;

public interface LoginService {

	public boolean isValidLoginCredentials(User user) throws BusinessException;
}
