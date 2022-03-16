package com.cenyol.mybatisplus.test.service.impl;

import com.cenyol.mybatisplus.test.entity.User;
import com.cenyol.mybatisplus.test.mapper.UserMapper;
import com.cenyol.mybatisplus.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 鐢ㄦ埛淇℃伅 服务实现类
 * </p>
 *
 * @author Cenyol
 * @since 2022-03-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
