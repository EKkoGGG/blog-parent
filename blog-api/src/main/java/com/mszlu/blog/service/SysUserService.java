package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.UserVo;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result getUserInfoByToken(String token);

    void save(SysUser sysUser);

    SysUser findUserByAccount(String account);

    UserVo findUserVoById(Long authorId);
}
