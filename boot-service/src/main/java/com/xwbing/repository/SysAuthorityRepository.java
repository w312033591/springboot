package com.xwbing.repository;

import com.xwbing.entity.SysAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 说明:
 * 项目名称: boot-module-demo
 * 创建时间: 2017/5/5 16:44
 * 作者:  xiangwb
 */
public interface SysAuthorityRepository extends JpaRepository<SysAuthority,String> {
}