package com.had.depressiontherapyappbackend.repositories;

import com.had.depressiontherapyappbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
}
