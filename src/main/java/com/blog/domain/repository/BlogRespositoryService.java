package com.blog.domain.repository;

import com.blog.domain.BlogDomain;
import com.blog.persistance.entity.Blog;

import java.util.List;

public interface BlogRespositoryService {
    List<BlogDomain> getAll();
}
