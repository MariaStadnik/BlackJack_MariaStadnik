package com.blackjack.utility;

import java.util.List;

public class BlackJack_Util {

    public static int countValues(List<String> allCards){
        int sum = 0;
        for (String eachCard : allCards) {
          if(eachCard.equals("JACK")||eachCard.equals("QUEEN")||eachCard.equals("KING")){
              sum+=10;
          }else if(eachCard.equals("ACE")){
              sum+=11;
          } else {
              sum+=Integer.parseInt(eachCard);
          }
        }
        return sum;
    }


}
