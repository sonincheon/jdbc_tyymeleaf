package com.fubaotv.vo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewVo {
  private int s_number;
  private String nick;
  private int t_number;
  private String talk;

  public ReviewVo(String uNick, int tNumber, String talk) {
  }
}