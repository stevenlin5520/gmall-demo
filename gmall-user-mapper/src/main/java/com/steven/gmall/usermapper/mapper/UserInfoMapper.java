package com.steven.gmall.usermapper.mapper;

import com.steven.gmall.usermapper.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

// mapper 泛型 表示当前mapper 要操作实体类
// 数据访问层
public interface UserInfoMapper extends Mapper<UserInfo> {

}
