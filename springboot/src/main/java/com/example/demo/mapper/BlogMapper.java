package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Blog;

public interface BlogMapper extends BaseMapper<Blog> {
    //分页查询,连接作者昵称
    Page<Blog> findPage(Page<Blog> page);
}
