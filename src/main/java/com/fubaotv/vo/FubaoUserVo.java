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
public class FubaoUserVo {
    private  String uname;
    private String gender;
    private Date birth;
    private String contact;
    private String nick;
    private String id;
    private String password;
    private Date enter_date;
    private int token;

}
