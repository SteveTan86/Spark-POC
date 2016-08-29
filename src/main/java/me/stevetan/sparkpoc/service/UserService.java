package me.stevetan.sparkpoc.service;

import me.stevetan.sparkpoc.model.User;

/**
 * Created by stevetan on 29/8/16.
 */
public interface UserService {
    User get(Integer id);

    User create(me.stevetan.sparkpoc.bean.User user);

    User update(me.stevetan.sparkpoc.bean.User user);

    User delete(Integer id);
}
