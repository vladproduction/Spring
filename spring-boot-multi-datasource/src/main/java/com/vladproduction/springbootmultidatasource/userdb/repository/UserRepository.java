package com.vladproduction.springbootmultidatasource.userdb.repository;

import com.vladproduction.springbootmultidatasource.userdb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by vladproduction on 10-Apr-24
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "update user set fake_email = 'test'", nativeQuery = true)
    @Modifying
    void updateWithError();

}
