package com.example.service.UserInformationService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.example.service.UserInformationService.model.UserInfoModel;
import com.example.service.UserInformationService.repositry.UserRepository;


@Service
@XRayEnabled
public class UserService {

	@Autowired
	UserRepository UserRepository;
	
	
	 public Optional<UserInfoModel> FindUserById(int id) {
	      return UserRepository.FindUserById(id);
	     }
	
	/*
	 * public boolean deleteById(UserInfoModel userInfoModel1){ return
	 * UserRepository.deleteById(userInfoModel1); }
	 */ 
	 
	 public void deleteById(Integer id){
			 UserRepository.deleteById(id);
		 }
	 
	/*
	 * public Optional<UserInfoModel> deleteUser(int id) { return
	 * UserRepository.deleteUser(id); }
	 */
		   
	
}
