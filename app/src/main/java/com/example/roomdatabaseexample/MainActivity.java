package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserDao mUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDatabase userDatabase = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "RoomDatabaseEx") //name: 데이터베이스 이름, 개발자가 지정하고 싶은 이름
                .fallbackToDestructiveMigration()       // 스키마(Database) 버전 변경 가능
                .allowMainThreadQueries()               // Main Thread에서 DB에 IO(입출력)를 가능하게 함
                .build();

        mUserDao = userDatabase.userDao();              // 인터페이스 객체 할당

        // 데이터 삽입
//        User user = new User();       // 새로운 객체 인스턴스 생성
//        user.setName("황진영");        // ID는 자동생성으로 설정하였기 때문에 안해도 됨
//        user.setAge("23");
//        user.setPhoneNumber("01012345678");
//        mUserDao.setInsertUser(user);

        List<User> userList = mUserDao.getUserAll();    // 미리 만들어놓은 조회 쿼리
        // 데이터 조회
        for (int i = 0; i < userList.size(); i++) {
            Log.d("TEST", userList.get(i).getName() + "\n"
                    + userList.get(i).getAge() + "\n"
                    + userList.get(i).getPhoneNumber() + "\n");
        }

        // 데이터 수정
//        User user2 = new User();       // 새로운 객체 인스턴스 생성
//        user2.setId(1);
//        user2.setName("황진영_수정");        // ID는 자동생성으로 설정하였기 때문에 안해도 됨
//        user2.setAge("20");
//        user2.setPhoneNumber("01011111111");
//        mUserDao.setUpdateUser(user2);

        // 데이터 삭제
        User user3 = new User();
        user3.setId(2);
        mUserDao.setDeleteUser(user3);
    }
}