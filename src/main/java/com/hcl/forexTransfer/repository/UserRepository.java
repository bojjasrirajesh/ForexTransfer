package com.hcl.forexTransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.forexTransfer.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>{
	
	

}
