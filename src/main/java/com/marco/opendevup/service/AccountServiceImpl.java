package com.marco.opendevup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marco.opendevup.dao.AppRoleRepository;
import com.marco.opendevup.dao.AppUserRepository;
import com.marco.opendevup.entities.AppRole;
import com.marco.opendevup.entities.AppUser;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private AppUserRepository appUserRepository;
	@Autowired
	private AppRoleRepository appRoleRepository;
	
	@Override
	public AppUser saveUser(AppUser user) {
		String hashPW = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(hashPW);
		return appUserRepository.save(user);
	}

	@Override
	public AppRole saveRole(AppRole role) { 
		return appRoleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		AppRole role = appRoleRepository.findByRoleName(roleName);
		AppUser user = appUserRepository.findByUsername(username);
		user.getRoles().add(role);
	}

	@Override
	public AppUser findUserByUsername(String username) {
		return appUserRepository.findByUsername(username);
	}

}
