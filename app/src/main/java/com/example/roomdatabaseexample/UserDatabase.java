package com.example.roomdatabaseexample;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1) // 변경 사항에 대해 관리하기 위해 버전을 명시해주어야 함
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
