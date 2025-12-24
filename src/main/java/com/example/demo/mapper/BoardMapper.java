package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Domain.Board;

@Mapper
public interface BoardMapper {
	List<Board> findBoard();
	Board BoardDetail(int bid);
	void WriteBoard(Board board);
	void UpdateBoard(Board board);
	void DeleteBoard(int bid);
	
}
