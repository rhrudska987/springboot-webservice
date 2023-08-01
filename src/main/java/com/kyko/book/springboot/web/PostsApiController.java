package com.kyko.book.springboot.web;

import com.kyko.book.springboot.service.PostsService;
import com.kyko.book.springboot.web.dto.PostsResponseDto;
import com.kyko.book.springboot.web.dto.PostsSaveRequestDto;
import com.kyko.book.springboot.web.dto.PostsUpdateReqestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable("id") Long id, @RequestBody PostsUpdateReqestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable("id") Long id){
        return postsService.findById(id);
    }

}
