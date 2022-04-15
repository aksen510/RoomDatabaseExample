package com.example.roomdatabaseexample;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity // 룸에서 지원하는 데이터 모델로서 활용하기 위함
public class User {
    @PrimaryKey(autoGenerate = true)    // ture: 새로운 사용자가 추가될 때마다 자동으로 id 값이 하나씩 올라가며 생성
    private int id = 0; // 하나의 사용자에 대한 고유 ID 값

    private String name;

    private String age;

    private String phoneNumber;

    // getter & setter 가져오거나, 세팅을 하기 위한 준비 단계

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
