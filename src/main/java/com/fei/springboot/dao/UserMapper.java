package com.fei.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fei.springboot.domain.User;

@Mapper
public interface UserMapper {

	@Insert("insert sys_user(id,user_name) values(#{id},#{userName})")
	void insert(User u);
	
	@Update("update sys_user set user_name = #{userName} where id=#{id} ")
	void update(User u);
	
	@Delete("delete from sys_user where id=#{id} ")
	void delete(@Param("id")String id);
	
	@Select("select id,user_name from sys_user where id=#{id} ")
	User find(@Param("id")String id);
	
	//注：方法名和要UserMapper.xml中的id一致
	List<User> query(@Param("userName")String userName);
	
	@Delete("delete from sys_user")
	void deleteAll();
}
