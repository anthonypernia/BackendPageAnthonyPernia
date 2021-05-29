package com.blog.domain.service;

import com.blog.domain.BlogDomain;
import com.blog.domain.repository.BlogRespositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRespositoryService blogRespositoryService;
    public List<BlogDomain> getAll(){
        return  blogRespositoryService.getAll();
    }
}
