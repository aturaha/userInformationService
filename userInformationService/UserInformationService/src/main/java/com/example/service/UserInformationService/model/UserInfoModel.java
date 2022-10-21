package com.example.service.UserInformationService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="user_details")
public class UserInfoModel {
	

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer detailId;
    private String name;
    private String email;
    private String password;
	
	
	/*
	 * private int id; private String name; private String info;
	 * 
	 * 
	 * 
	 * 
	 * public UserInfoModel(int id, String name, String info) { super(); this.id =
	 * id; this.name = name; this.info = info; }
	 * 
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getInfo() { return info; } public void
	 * setInfo(String info) { this.info = info; }
	 */
	

}
