package com.icrona.springrest.service;

import com.icrona.springrest.api.request.UserCmd;
import com.icrona.springrest.api.response.UserDto;
import com.icrona.springrest.entity.User;
import com.icrona.springrest.jpa.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * [Documentation]
 *
 * @author Jurnal
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    @NonNull
    private UserRepository userRepository;

    public UserDto getUser(Long id) {

        return userRepository.findById(id)
            .map(UserDto::new)
            .get();
    }

    public List<UserDto> getAllUser(){
        return userRepository.findAll()
            .stream()
            .map(UserDto::new)
            .collect(Collectors.toList());
    }

    public UserDto addUser(UserCmd userCmd) {

        User user = new User(userCmd.getName());

        return new UserDto(userRepository.save(user));
    }
}
