package com.zking.mapper;

import com.zking.model.User;
import javafx.scene.effect.SepiaTone;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByName(String userName);

    /**
     * 根据用户名获取到用户的角色信息
     * @param username
     * @return
     */
    Set<String> getRole(String  username);

    /**
     * 根据用户名获取到用户的权限信息
     * @param username
     * @return
     */
    Set<String> getPermission(String  username);
}