package com.tt.office_game_manager.event;

import com.tt.office_game_manager.discipline.DisciplineType;
import com.tt.office_game_manager.user.UserEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by niemiecw on 07.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "event")
public class EventEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "discipline_type")
    private DisciplineType disciplineType;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity owner;

    @Column(name = "begin_date")
//    @Temporal(TemporalType.DATE)
    private Date beginDate;

    @Column(name = "end_date")
//    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "is_ranked")
    private Boolean isRanked;

    @Column(name = "is_tournament")
    private Boolean isTournament;
}
