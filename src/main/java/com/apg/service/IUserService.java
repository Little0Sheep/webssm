package com.apg.service;

import com.apg.pojo.User;
import java.util.List;
/**
 * Created by apg on 2017/3/4.
 */
public interface IUserService {
    public User getUserById(int userId);
    public int deleteUser(int userId);
    public int updateUser(User record);
    public List<User> queryUsers();
    public int selectByEmail(String userEmail);
    public int insert(User user);
    public User loginCheck(User user);
}
