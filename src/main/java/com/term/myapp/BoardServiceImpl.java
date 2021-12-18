package com.term.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.term.myapp.board.BoardDAO;
import com.term.myapp.board.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDAO;

	@Override
	public int insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return boardDAO.insertBoard(vo);
	}

	@Override
	public int deleteBoard(int seq) {
		// TODO Auto-generated method stub
		return boardDAO.deleteBoard(seq);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return boardDAO.updateBoard(vo);
	}

	@Override
	public BoardVO getBoard(int seq) {
		// TODO Auto-generated method stub
		return boardDAO.getBoard(seq);
	}

	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList();
	}
	

}