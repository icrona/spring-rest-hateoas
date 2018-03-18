package com.icrona.springrest.api.response;

import com.icrona.springrest.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

/**
 * [Documentation]
 *
 * @author Jurnal
 */

@Data
@AllArgsConstructor
public class UserDto extends ResourceSupport{

    private Long userId;

    private String name;

    public UserDto(User user) {

        this(user.getId(), user.getName());
    }
}
