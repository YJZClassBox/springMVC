package com.cenyol.mybatisplus.test.service.impl;

import com.cenyol.mybatisplus.test.entity.Test;
import com.cenyol.mybatisplus.test.mapper.TestMapper;
import com.cenyol.mybatisplus.test.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Cenyol
 * @since 2022-03-17
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
