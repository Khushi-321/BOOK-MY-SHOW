package com.bookMyshow.bookMyshow.Repository;

import com.bookMyshow.bookMyshow.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
