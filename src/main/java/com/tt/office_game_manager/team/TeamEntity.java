package com.tt.office_game_manager.team;

import com.tt.office_game_manager.user.UserEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by niemiecw on 07.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "team")
public class TeamEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserEntity owner;
}
