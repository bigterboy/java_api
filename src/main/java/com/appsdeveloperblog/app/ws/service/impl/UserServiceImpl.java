package com.appsdeveloperblog.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.appsdeveloperblog.app.ws.UserRepository;
import com.appsdeveloperblog.app.ws.io.entity.UserEntity;
import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

//	@Autowired
//	UserRepository UserRepository;
	
	@Override
	public UserDto createUser(UserDto user) {
		// TODO Auto-generated method stub
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEmail("test@gmail.com");
		userEntity.setUserId("testUserId");
		
		
		//UserEntity storedUserDetails = UserRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(userEntity, returnValue);
		
		return returnValue;
	}

}
