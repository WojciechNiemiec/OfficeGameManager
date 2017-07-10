package com.tt.office_game_manager.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by niemiecw on 07.07.2017.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Team implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;
    private String name;
    @ManyToOne
    @JoinColumn(name="userId")
    private User owner;
}
