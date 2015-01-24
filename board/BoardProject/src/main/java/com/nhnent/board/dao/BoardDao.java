package com.nhnent.board.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;
import com.nhnent.board.model.Board;
import com.nhnent.board.service.MysqlConnection;
@Repository
public class BoardDao {
	@Autowired
	private MysqlConnection mySqlConnection;
	public List<Board> getBoards(){		
		return null;
	}

	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		Connection con = mySqlConnection.getConnection();
		try {
			String query = " insert into board (title, creator, content)"
					+ " values (?, ?, ?)";
	
			PreparedStatement preparedStmt = con.prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS);
			preparedStmt.setString(1, board.getTitle());
			preparedStmt.setString(2, board.getCreator());
			preparedStmt.setString(3, board.getContent());
			preparedStmt.execute();
			preparedStmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public List<Board> getBoardList() {
		Connection con = mySqlConnection.getConnection();
		List<Board> boardList = new ArrayList<Board>();
		try {

			String query = "SELECT * FROM board";
			java.sql.Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Board board = new Board(rs.getString("title"), rs.getString("creator"),
						rs.getString("content"));
				boardList.add(board);
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}

		return boardList;
	}
}
