package com.fubaotv.vo;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Like_DisVo {
    private int s_number;
    private BigDecimal s_like;
    private BigDecimal s_dis;
    private int my_like;
    private int my_dis;

    public Like_DisVo(int s_number, BigDecimal s_like, BigDecimal s_dis) {
        this.s_number = s_number;
        this.s_like = s_like;
        this.s_dis = s_dis;
    }
}




















