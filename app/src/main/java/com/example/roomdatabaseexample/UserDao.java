package com.example.roomdatabaseexample;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Data Access Object : 어떠한 행위를 할 인터페이스, 데이터 액세스 할 수 있는 객체
 */
@Dao
public interface UserDao {

    @Insert // 삽입
    void setInsertUser(User user);

    @Update // 수정
    void setUpdateUser(User user);

    @Delete // 삭제
    void setDeleteUser(User user);

    // 조회 쿼리
    @Query("SELECT * FROM User")  // 쿼리 : 데이터베이스에 요청하는 명령문 , * : 전체 조회
    List<User> getUserAll();

}
