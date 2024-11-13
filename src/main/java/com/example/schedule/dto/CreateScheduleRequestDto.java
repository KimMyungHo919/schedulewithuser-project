package com.example.schedule.dto;

import lombok.Getter;

@Getter
public class CreateScheduleRequestDto {

    private final String title;

    private final String contents;

    private final String username; // 어떤 회원이 작성했는지 요청정보에 담겨있어야한다.

    public CreateScheduleRequestDto(String title, String contents, String username) {
        this.title = title;
        this.contents = contents;
        this.username = username;
    }
}
