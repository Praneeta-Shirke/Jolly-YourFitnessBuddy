package com.JollyPages.Jolly.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PointsTransaction {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    private User user;

	    @Column(nullable = false, columnDefinition = "int default 1000")
	    private int points;
	    private LocalDateTime timestamp;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public int getPoints() {
			return points;
		}
		public void setPoints(int points) {
			this.points = points;
		}
		public LocalDateTime getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}
		@Override
		public String toString() {
			return "PointsTransaction [id=" + id + ", user=" + user + ", points=" + points + ", timestamp=" + timestamp
					+ "]";
		}
		public PointsTransaction(Long id, User user, int points, LocalDateTime timestamp) {
			super();
			this.id = id;
			this.user = user;
			this.points = points;
			this.timestamp = timestamp;
		}
		public PointsTransaction() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
