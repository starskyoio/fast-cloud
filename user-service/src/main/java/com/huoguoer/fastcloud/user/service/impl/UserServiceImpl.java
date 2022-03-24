package com.huoguoer.fastcloud.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huoguoer.fastcloud.user.entity.User;
import com.huoguoer.fastcloud.user.service.UserService;
import com.huoguoer.fastcloud.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author linus
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2022-03-24 09:39:30
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
