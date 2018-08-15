package com.multilevelMenu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name="level_2")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Level_2{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_level_2")
    private long id;

    @Column
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_level_1", referencedColumnName = "id_level_1")
    private Level_1 level_1;
}
