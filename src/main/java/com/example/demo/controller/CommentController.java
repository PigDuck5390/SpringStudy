package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Domain.Comment;
import com.example.demo.Service.CommentService;

@Controller
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/comment/add")
    public String add(Comment comment) {
        commentService.addComment(comment);
        return "redirect:/boarddetail?bid=" + comment.getBid();
    }

    @PostMapping("/comment/delete")
    public String delete(@RequestParam int cid, @RequestParam int bid) {
        commentService.deleteComment(cid);
        return "redirect:/boarddetail?bid=" + bid;
    }
}
