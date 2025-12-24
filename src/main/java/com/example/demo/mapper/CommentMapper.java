package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Domain.Comment;

@Mapper
public interface CommentMapper {
	List<Comment> selectComment(int bid);
	void insertComment(Comment comment);
	void deleteComment(int cid);
	
	
	
}
