package com.tt.office_game_manager.match;

import com.tt.office_game_manager.event.EventEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jereczekt on 12.07.2017.
 */
@Data
@Entity
@Table(name = "match")
public class MatchEntity implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity eventEntity;
    @Column (name = "level")
    private Integer level;
}
