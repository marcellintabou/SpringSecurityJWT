package com.marco.opendevup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.opendevup.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, Long>{

	public AppRole findByRoleName(String roleName);
}
