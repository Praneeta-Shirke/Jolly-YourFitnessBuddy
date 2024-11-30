package com.JollyPages.Jolly.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.PointsTransaction;
import com.JollyPages.Jolly.entities.User;

@Repository
public interface PointsTransactionRepository extends JpaRepository<PointsTransaction, Integer>{
	List<PointsTransaction> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
	List<PointsTransaction> findAllUsersByOrderByPointsDesc();
	 @Query("SELECT p FROM PointsTransaction p WHERE p.timestamp BETWEEN :start AND :end ORDER BY p.points DESC")
	    List<PointsTransaction> findByTimestampBetweenWherePointsDesc(
	        @Param("start") LocalDateTime start, 
	        @Param("end") LocalDateTime end
	    );
}
