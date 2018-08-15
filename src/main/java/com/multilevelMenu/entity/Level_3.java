package com.multilevelMenu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="level_3")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Level_3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_level_3")
    private long id;

    @Column
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_level_2", referencedColumnName = "id_level_2")
    private Level_2 level_2;
}
