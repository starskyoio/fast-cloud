package com.huoguoer.fastcloud.user.contoller;

import com.huoguoer.fastcloud.user.entity.User;
import com.huoguoer.fastcloud.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.list();
    }
}
