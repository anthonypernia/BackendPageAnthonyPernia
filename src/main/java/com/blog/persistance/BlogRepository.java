package com.blog.persistance;

import com.blog.domain.BlogDomain;
import com.blog.domain.repository.BlogRespositoryService;
import com.blog.persistance.crud.BlogCrudRepository;
import com.blog.persistance.entity.Blog;
import com.blog.persistance.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BlogRepository implements BlogRespositoryService {
    @Autowired
    private  BlogCrudRepository blogCrudRepository;
    @Autowired
    private BlogMapper blogMapper;


    @Override
    public List<BlogDomain> getAll() {
        List<Blog> blogs = (List<Blog>) blogCrudRepository.findAll();
        return blogMapper.toBlogsDomain(blogs);
    }
}
