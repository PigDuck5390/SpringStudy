package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Domain.Comment;
import com.example.demo.mapper.CommentMapper;
import java.util.List;

@Service
public class CommentService {
	private final CommentMapper commentMapper;
	public CommentService(CommentMapper commentMapper) {
		this.commentMapper = commentMapper;
	}
	public List<Comment> getComments(int bid){
		return commentMapper.selectComment(bid);
	}
	public void addComment(Comment comment) {
		commentMapper.insertComment(comment);
	}
	public void deleteComment(int cid) {
		commentMapper.deleteComment(cid);
	}
	
}
