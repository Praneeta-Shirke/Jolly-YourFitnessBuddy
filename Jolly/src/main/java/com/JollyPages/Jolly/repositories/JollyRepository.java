package com.JollyPages.Jolly.repositories;

import org.eclipse.angus.mail.imap.protocol.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.User;

@Repository
public interface JollyRepository extends JpaRepository<User, ID>{

}
