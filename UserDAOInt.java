package org.company.sbcrudrestful.dao;

import org.company.sbcrudrestful.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAOInt extends JpaRepository<User, Long>{

}
