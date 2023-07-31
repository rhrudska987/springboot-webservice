package com.kyko.book.springboot.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public class UserDto {

    private final String name;
    private final int age;

}
