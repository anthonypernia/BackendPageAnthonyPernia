package com.blog.persistance.mapper;

import com.blog.domain.BlogDomain;
import com.blog.persistance.entity.Blog;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BlogMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "body", target = "body"),
            @Mapping(source = "author", target = "author")
    })
    BlogDomain toBlogDomain(Blog blog);

    List<BlogDomain> toBlogsDomain(List<Blog> blog);
    @InheritInverseConfiguration
    Blog toBlog(BlogDomain blogDomain);


}
