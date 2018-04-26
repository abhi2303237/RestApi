package com.knight.auth;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser,Long>{

}
