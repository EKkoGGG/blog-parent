package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;

public interface SysUserService {
    SysUser findUserById(Long id);
}
