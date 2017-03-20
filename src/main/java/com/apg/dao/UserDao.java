package com.apg.dao;

import java.util.List;
import com.apg.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> queryAll();

    int selectByEmail(String userEmail);

    User loginCheck(User user);
}