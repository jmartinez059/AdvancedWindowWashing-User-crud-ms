package com.fifth.pillar.usercrudms.repositories;

import com.fifth.pillar.usercrudms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
