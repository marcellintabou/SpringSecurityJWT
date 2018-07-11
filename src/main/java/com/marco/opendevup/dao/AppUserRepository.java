package com.marco.opendevup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.opendevup.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{

	public AppUser findByUsername(String username);
}
