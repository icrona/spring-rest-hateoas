package com.icrona.springrest.jpa;

import com.icrona.springrest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * [Documentation]
 *
 * @author Jurnal
 */
@Transactional
public interface UserRepository extends JpaRepository<User, Long>{
}
