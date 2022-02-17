package com.hashedin.hu22.repositories;

import com.hashedin.hu22.entities.UserCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCartRepository extends JpaRepository<UserCart, Long> {
}
