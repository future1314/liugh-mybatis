package com.liugh.mapper;

import com.liugh.bean.User;

import java.util.List;

public interface UserMapper {
	List<User> getUserById(String id);
}
