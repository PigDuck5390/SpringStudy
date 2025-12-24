package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Domain.Board;
import com.example.demo.mapper.BoardMapper;

@Service
public class BoardService {
	private final BoardMapper boardMapper;
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	public List<Board> getBoard() {
		return boardMapper.findBoard();
	}
	public Board getBoardDetail(int bid) {
		return boardMapper.BoardDetail(bid);
	}
	public void SaveBoard(Board board) {
		boardMapper.WriteBoard(board);
	}
	public void UpdateBoard(Board board) {
		boardMapper.UpdateBoard(board);
	}
	public void DeleteBoard(int bid) {
		boardMapper.DeleteBoard(bid);
	}

}
