package com.JollyPages.Jolly.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findAllByOrderByTimestampDesc();
	User findByGmail(String gmail);
	@Query("SELECT u FROM User u ORDER BY u.points DESC")
    List<User> findAllUsersByOrderByPointsDesc();
	
	List<User> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
	
	@Query("SELECT u FROM User u WHERE MONTH(u.timestamp) = :month AND u.timestamp BETWEEN :startDate AND :endDate")
	List<User> findByMonthAndTimestampBetween(@Param("month") int month, @Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);

}