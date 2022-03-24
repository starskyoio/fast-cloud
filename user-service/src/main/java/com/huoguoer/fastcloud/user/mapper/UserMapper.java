package com.huoguoer.fastcloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huoguoer.fastcloud.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author linus
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2022-03-24 09:39:30
* @Entity com.huoguoer.fastcloud.user.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
