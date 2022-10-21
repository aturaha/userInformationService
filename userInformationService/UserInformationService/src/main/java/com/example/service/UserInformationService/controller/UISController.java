package com.example.service.UserInformationService.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserInformationService.model.UserDetailsReqDTO;
import com.example.service.UserInformationService.model.UserInfoModel;
import com.example.service.UserInformationService.service.CoreService;



@RestController
@RequestMapping("/deleteuser")
public class UISController {

	@Autowired
	CoreService coreService;

	/*
	 * @RequestMapping("/{userId}") public List<UserInfoModel>
	 * getUserInfo(@PathVariable("userId") String userId){ return
	 * Collections.singletonList(new UserInfoModel(11,"myname", "myInfo")); }
	 */
	
	
	@DeleteMapping("/delete")
    public ResponseEntity deleteUser(@RequestBody UserDetailsReqDTO
    userDetailsReqDTO) {
    
    return coreService.deleteUser(userDetailsReqDTO);
    }
	

}
