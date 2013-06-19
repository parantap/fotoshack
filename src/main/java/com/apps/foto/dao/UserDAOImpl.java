/**
 * 
 */
package com.apps.foto.dao;

import com.apps.foto.entity.User;

/**
 * 
 * @author parantap
 * 
 */
public class UserDAOImpl extends GenericDaoImpl<User, String> implements UserDAO {

    public UserDAOImpl() {
        super(User.class);
    }

}
