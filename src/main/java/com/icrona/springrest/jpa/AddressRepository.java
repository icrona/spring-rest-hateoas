package com.icrona.springrest.jpa;

import com.icrona.springrest.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * [Documentation]
 *
 * @author Jurnal
 */
@Transactional
public interface AddressRepository extends JpaRepository<Address, Long>{
}
