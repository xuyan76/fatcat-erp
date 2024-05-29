package com.fatcat.erp.services.system.web;

import com.fatcat.erp.common.entity.ApiResponse;
import com.fatcat.erp.common.utils.ResultBuilder;
import com.fatcat.erp.services.system.dao.UserRepository;
import com.fatcat.erp.services.system.enties.User;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserRepository userDao;

    @GetMapping("/list")
    public ApiResponse<Iterable<User>> list(){
        return ResultBuilder.success(userDao.findAll());
    }
}
