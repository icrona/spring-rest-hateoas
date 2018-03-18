package com.icrona.springrest.entity;

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

    public User(String name) {
        this.name = name;
    }
}
