package com.fubaotv.vo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ADUserVo {
    private String company;
    private String banner;
    private Date start_AD;
    private Date end_AD;
    private int AD_Views;
    private int view_Price;
    private int company_maony;
    public ADUserVo(String banner) {
        this.banner = banner;
    }

}