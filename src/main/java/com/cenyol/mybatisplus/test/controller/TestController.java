package com.cenyol.mybatisplus.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cenyol.mybatisplus.common.controller.CurdController;
import com.cenyol.mybatisplus.test.entity.Test;

/**
 * <p>
 *  控制器
 * </p>
 *
 * @author Cenyol
 * @since 2022-03-17
*/
@RestController
@RequestMapping("/test/test")
public class TestController extends CurdController<Test> {

}
