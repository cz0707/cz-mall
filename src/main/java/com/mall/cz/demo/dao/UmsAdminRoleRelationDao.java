package com.mall.cz.demo.dao;

import com.mall.cz.demo.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 */
public interface UmsAdminRoleRelationDao {

    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
