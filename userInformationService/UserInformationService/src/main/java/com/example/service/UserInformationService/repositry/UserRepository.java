package com.example.service.UserInformationService.repositry;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.service.UserInformationService.model.UserInfoModel;

public interface UserRepository extends JpaRepository<UserInfoModel, Integer>{

	
	 @Query("SELECT ufh FROM UserInfoModel ufh WHERE ufh.detailId = ?1")
	 Optional<UserInfoModel> FindUserById(int id);
	 
	 //@Query("Delete ufh FROM UserInfoModel ufh WHERE ufh.detailId = ?1")
	 //Boolean deleteById(UserInfoModel userInfoModel1);

	    @Override
	    @Transactional
	    void deleteById(Integer id);
		
	 
	/*
	 * @Query("Delete ufh FROM UserInfoModel ufh WHERE ufh.detailId = ?1")
	 * Optional<UserInfoModel> deleteUser(int id);
	 */
	   
	
}
