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
@Table(name = "addresses", schema = "aldo")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String city;
}
