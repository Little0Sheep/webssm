package com.apg.service.impl;

import org.springframework.stereotype.Service;

import com.apg.dao.UserDao;
import com.apg.pojo.User;
import com.apg.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

    public int deleteUser(int userId){
        return this.userDao.deleteByPrimaryKey(userId);
    }

    public int updateUser(User record){
        return this.userDao.updateByPrimaryKeySelective(record);
    }

    public List<User> queryUsers(){
        return this.userDao.queryAll();
    }

    public int selectByEmail(String userEmail){
        return this.userDao.selectByEmail(userEmail);
    }

    public int insert(User user){
        return this.userDao.insert(user);
    }

    public User loginCheck(User user){
        return this.userDao.loginCheck(user);
    }

}
