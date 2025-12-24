package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Domain.Board;
import com.example.demo.Domain.Comment;
import com.example.demo.Service.BoardService;
import com.example.demo.Service.CommentService;

@Controller
public class BoardController {
	private final BoardService boardService;
	private final CommentService commentService;
		public BoardController(BoardService boardService, CommentService commentService) {
		this.boardService = boardService;
		this.commentService = commentService;
	}
	@GetMapping("/boardlist")
	public String BoardList(Model model) {
		List<Board> boardlist = boardService.getBoard();
		model.addAttribute("boardlist", boardlist);
		return "BoardList";
		}
	
	@GetMapping("/board/detail")
	public String boardDetail(@RequestParam int bid, Model model) {
		Board boardDetail = boardService.getBoardDetail(bid);
		List<Comment> comments = commentService.getComments(bid);
		model.addAttribute("boardDetail", boardDetail);
		model.addAttribute("comments", comments);
		return "BoardDetail";
	}
	@GetMapping("/board/write")
	public String boardwrite() {
		return "BoardWrite";
	}
	@PostMapping("/write")
	public String Write(Board board) {
		boardService.SaveBoard(board);
		return "redirect:/boardlist";
		
	}
	@GetMapping("/board/edit")
	public String EditBoard(@RequestParam int bid, Model model) {
	    Board board = boardService.getBoardDetail(bid);
	    model.addAttribute("board", board);
	    return "BoardEdit";
	}

	@PostMapping("/board/update")
	public String Update(Board board) {
		boardService.UpdateBoard(board);
		return "redirect:/board/detail?bid="+board.getBid();
	}
	@PostMapping("/board/delete")
	public String Delete(@RequestParam int bid) {
		boardService.DeleteBoard(bid);
		return "redirect:/boardlist";
	}
}
