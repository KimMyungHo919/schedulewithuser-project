package com.example.schedule.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "schedule")
public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "longtext") // 긴 텍스트
    private String contents;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Schedule() {}

    public Schedule(String title, String contents) {
        this.title = title;
        this.contents = contents;
    } // id는 자동생성 , user는 그냥 참조만.

    public void setUser(User user) {
        this.user = user;
    }
}
