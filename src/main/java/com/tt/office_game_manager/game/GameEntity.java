package com.tt.office_game_manager.game;

import com.tt.office_game_manager.event.EventEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jereczekt on 12.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "game")
public class GameEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity eventEntity;

    @Column (name = "level")
    private Integer level;
}
