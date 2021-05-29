package com.blog.persistance.crud;

import com.blog.persistance.entity.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogCrudRepository extends CrudRepository<Blog, Integer > {

}
