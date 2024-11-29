package com.JollyPages.Jolly.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.PointsTransaction;

@Repository
public interface PointsTransactionRepository extends JpaRepository<PointsTransaction, Integer>{
	List<PointsTransaction> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
}
