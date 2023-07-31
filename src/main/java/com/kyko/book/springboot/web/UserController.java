package com.kyko.book.springboot.web;

import com.kyko.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user")
    public UserDto 유저조회(@RequestParam("name") String name, @RequestParam("age") int age){
        return new UserDto(name, age);
    }

}
