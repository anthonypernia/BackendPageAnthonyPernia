package com.blog.web.controller;
import com.blog.domain.BlogDomain;
import com.blog.domain.service.BlogService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/start")
    @ApiOperation("Get all blogs")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<BlogDomain>> getAllBlogs(){
        System.out.println(blogService.getAll());
        return new ResponseEntity<>(blogService.getAll(), HttpStatus.OK);
    }
}
