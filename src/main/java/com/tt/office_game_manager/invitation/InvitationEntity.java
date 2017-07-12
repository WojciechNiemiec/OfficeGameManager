package com.tt.office_game_manager.invitation;

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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class InvitationEntity implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private InvitationStatusType status;
    @Column(name = "date")
    private Date date;
}