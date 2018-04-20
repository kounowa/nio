package com.xyf.nio.iface;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;

import com.xyf.nio.iface.IUserService.Iface;

public class userIfaceImpl implements Iface {

	public void add(User user) throws TException {
		System.out.println("add");
		System.out.println(user.toString());

	}

	public void deleteById(int id) throws TException {
		System.out.println("deleteById");

	}

	public void updateById(User user) throws TException {
		System.out.println("updateById");

	}

	public User findById(int id) throws TException {
		System.out.println("updateById");
		User user = new User();
		user.setEmail("366666@qq.com");
		return user;
	}

	public List<User> findAll() throws TException {
		System.out.println("findAll");
		List<User> users = new ArrayList<User>();
		return users;
	}

}
