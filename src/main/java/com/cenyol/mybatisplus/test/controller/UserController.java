package com.cenyol.mybatisplus.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cenyol.mybatisplus.common.controller.CurdController;
import com.cenyol.mybatisplus.test.entity.User;

import java.util.Date;

/**
 * <p>
 * 鐢ㄦ埛淇℃伅 控制器
 * </p>
 *
 * @author Cenyol
 * @since 2022-03-16
*/
@RestController
@RequestMapping("/test/user")
public class UserController extends CurdController<User> {


}
