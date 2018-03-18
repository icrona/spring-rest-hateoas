package com.icrona.springrest.controller;

import com.icrona.springrest.entity.Address;
import com.icrona.springrest.service.AddressService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [Documentation]
 *
 * @author Jurnal
 */

@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddressController {

    @NonNull
    private AddressService addressService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable("id") Long id) {

        return ResponseEntity.ok(addressService.getAddress(id));
    }
}
