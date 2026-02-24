package com.uth.dyslexia.repository;

import com.uth.dyslexia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 *
 * <p>Mô tả chi tiết:</p>
 *
 * @param
 * @author DanielDanzel
 * @version 1.0
 * @return
 * @throws
 * @since 2/24/2026
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u " +
            "from User u " +
            "where u.username = :username")
    Optional<User> findByUsername(@Param("username") String username);
}
