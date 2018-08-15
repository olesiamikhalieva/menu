package com.multilevelMenu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name="level_1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Level_1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_level_1")
    private long id;

    @Column
    private String name;

}


