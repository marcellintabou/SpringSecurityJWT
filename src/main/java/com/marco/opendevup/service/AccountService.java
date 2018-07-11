package com.marco.opendevup.service;

import com.marco.opendevup.entities.AppRole;
import com.marco.opendevup.entities.AppUser;

public interface AccountService {
	public AppUser saveUser(AppUser u);
	public AppRole saveRole(AppRole r);
	public void addRoleToUser(String username, String roleName);
	public AppUser findUserByUsername(String username);

}
