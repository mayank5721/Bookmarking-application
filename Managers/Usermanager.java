package com.mine.managers;

import com.mine.entities.User;

public class Usermanager {
    private static Usermanager instance =new Usermanager();
    private Usermanager(){}

    public static Usermanager getInstance()
    {
        return instance;
    }

    public User createuser(long id, String email, String password, String firstname, String lastname, int gender, String usertype)
    {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setPassword(password);
        user.setUsertype(usertype);
        user.setGender(gender);

        return user;
    }
}
