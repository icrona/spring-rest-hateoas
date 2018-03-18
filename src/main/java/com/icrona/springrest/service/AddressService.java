package com.icrona.springrest.service;

import com.icrona.springrest.entity.Address;
import com.icrona.springrest.jpa.AddressRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * [Documentation]
 *
 * @author Jurnal
 */

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddressService {

    @NonNull
    private AddressRepository addressRepository;

    public Address getAddress(Long id) {

        return addressRepository.findById(id)
            .get();
    }
}
