package com.icrona.springrest.entity;

import com.icrona.springrest.api.request.UserCmd;
import lombok.*;

import javax.persistence.*;

/**
 * [Documentation]
 *
 * @author Jurnal
 */
@Data
@Getter
@Entity
@ToString
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Table(name = "users", schema = "aldo")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public User(UserCmd cmd) {

        Address address = new Address();
        address.setName(cmd.getAddress());
        address.setCity(cmd.getCity());

        this.name = cmd.getName();
        this.address = cmd.getAddress() == null ? null : address;
    }
}
