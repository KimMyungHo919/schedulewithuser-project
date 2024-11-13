package com.example.schedule.entity;

import jakarta.persistence.*;

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
}
