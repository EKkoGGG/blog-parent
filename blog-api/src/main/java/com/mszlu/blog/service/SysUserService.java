package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result getUserInfoByToken(String token);

    void save(SysUser sysUser);

    SysUser findUserByAccount(String account);
}
