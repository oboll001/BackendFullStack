package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer>{

	@Query("select acc from Accounts acc where acc.customer_id = ?1")
	List<Accounts> findAccountsByID(Integer CID);
	
}
