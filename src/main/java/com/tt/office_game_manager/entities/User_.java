package com.tt.office_game_manager.entities;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Created by niemiecw on 10.07.2017.
 */
@StaticMetamodel(User.class) //Must be in the same package
public class User_ {
    public static volatile SingularAttribute<User, Long> userId;
    public static volatile SingularAttribute<User, String> login;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, Team> teams;
}
