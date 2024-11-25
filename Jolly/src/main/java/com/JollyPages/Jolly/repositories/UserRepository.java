package com.JollyPages.Jolly.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findAllByOrderByTimestampDesc();
	User findByGmail(String gmail);
//	List<User> findAllByPointsDesc(int points);
}
