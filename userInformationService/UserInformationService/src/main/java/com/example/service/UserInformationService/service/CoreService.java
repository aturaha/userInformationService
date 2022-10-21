package com.example.service.UserInformationService.service;

import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.example.service.UserInformationService.model.UserDetailsReqDTO;
import com.example.service.UserInformationService.model.UserInfoModel;
//import com.google.common.net.MediaType;
import com.example.service.UserInformationService.repositry.UserRepository;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@RestController
@Service
@XRayEnabled
public class CoreService {
   
	@Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

 
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);

      
    /* to authenticate the user */
      
      public ResponseEntity deleteUser(@org.springframework.web.bind.annotation.RequestBody UserDetailsReqDTO
      userDetailsReqDTO) {
      
      //UserInfoModel userInfoModel = null;
      
      UserInfoModel userInfoModel = new UserInfoModel();
      
      if(!userDetailsReqDTO.getDetailId().equals("")) {
      
      Optional<UserInfoModel> users= userService.FindUserById(userDetailsReqDTO.getDetailId());
      
      if(users.isPresent()){
    	  UserInfoModel UserInfoModel1 = users.get();
      
    	    //Boolean status =  userService.deleteById(UserInfoModel1);
    	    userService.deleteById(UserInfoModel1.getId());
    	    return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully!");
    	     
    	    //Optional<UserInfoModel> user1= userService.deleteUser(userDetailsReqDTO.getDetailId());
       
      }else{
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("use correct user Id");
      }
      }else {
    	 
    	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("please enter a id");
    	     
      }
      //return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user does not exist!");
      

      }

}