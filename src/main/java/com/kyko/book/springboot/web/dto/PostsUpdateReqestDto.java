package com.kyko.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateReqestDto {

    private String title;
    private String content;

    @Builder
    public PostsUpdateReqestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
