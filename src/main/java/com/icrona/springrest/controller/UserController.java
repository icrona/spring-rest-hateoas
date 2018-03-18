package com.icrona.springrest.controller;


import com.icrona.springrest.api.request.UserCmd;
import com.icrona.springrest.api.response.UserDto;
import com.icrona.springrest.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * [Documentation]
 *
 * @author Jurnal
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @NonNull
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {

        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id) {

        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserCmd userCmd) {

        return ResponseEntity.ok(userService.addUser(userCmd));

    }
}
