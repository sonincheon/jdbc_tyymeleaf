package com.fubaotv.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StreamingVo {
    private int sNum;
    private String genre;
    private String title;
    private Date date;
    private String cast;
    private String producer;
    private String runningTime;
    private int views;

}

