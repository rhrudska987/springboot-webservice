package com.kyko.book.springboot.service;

import com.kyko.book.springboot.domain.posts.Posts;
import com.kyko.book.springboot.domain.posts.PostsRepository;
import com.kyko.book.springboot.web.dto.PostsResponseDto;
import com.kyko.book.springboot.web.dto.PostsSaveRequestDto;
import com.kyko.book.springboot.web.dto.PostsUpdateReqestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateReqestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(()
        -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    @Transactional(readOnly = true)
    public PostsResponseDto findById(Long id) {

        Posts entity = postsRepository.findById(id).orElseThrow(()
        -> new IllegalArgumentException("핻당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);

    }
}
