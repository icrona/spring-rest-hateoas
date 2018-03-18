package com.icrona.springrest.api.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.icrona.springrest.controller.AddressController;
import com.icrona.springrest.controller.UserController;
import com.icrona.springrest.entity.Address;
import com.icrona.springrest.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * [Documentation]
 *
 * @author Jurnal
 */

@Getter
public class UserDto extends ResourceSupport{

    private Long userId;

    private String name;

    @JsonIgnore
    private Address address;

    private String addressName;

    public UserDto(User user) {

        this.userId = user.getId();
        this.name = user.getName();
        this.address = user.getAddress();
        this.addressName = user.getAddress() == null ? null : user.getAddress().getName();
    }

    public UserDto withSelfLink() {
        Link link = linkTo(UserController.class).slash(this.getUserId()).withSelfRel();
        this.add(link);
        return this;

    }

    public UserDto withAddressLink() {

        if(getAddress() == null) {
            return this;
        }

        Link link = linkTo(AddressController.class).slash(getAddress().getId()).withRel("address");

        this.add(link);
        return this;
    }
}
