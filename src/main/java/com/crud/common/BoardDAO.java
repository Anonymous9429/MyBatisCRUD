//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.crud.common;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public BoardDAO() {
    }

    public int insertBoard(BoardVO vo) {
        System.out.println("===> JDBC로 insertBoard() 기능 처리");
        int result = this.sqlSession.insert("Board.insertBoard", vo);
        return result;
    }

    public int deleteBoard(int id) {
        System.out.println("===> JDBC로 deleteBoard() 기능 처리");
        int delete = this.sqlSession.delete("Board.deleteBoard", id);
        return delete;
    }

    public int updateBoard(BoardVO vo) {
        System.out.println("===> JDBC로 updateBoard() 기능 처리");
        int update = this.sqlSession.update("Board.updateBoard", vo);
        return update;
    }

    public BoardVO getBoard(int seq) {
        BoardVO one = (BoardVO)this.sqlSession.selectOne("Board.getBoard", seq);
        return one;
    }

    public List<BoardVO> getBoardList() {
        List<BoardVO> list = this.sqlSession.selectList("Board.getBoardList");
        return list;
    }
}
