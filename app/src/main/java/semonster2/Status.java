package semonster2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

public class Status {

  public void Job() {
    int [] firstst;
    int i;
    firstst = new int[5];
    System.out.println("キャラクターを生成します");
    System.out.println("職業を適応しています");
    Random random = new Random();
    int num = random.nextInt(5);
    try{
      Thread.sleep(3000);
    }catch(Exception ex){
      ex.printStackTrace();
    }
    switch (num) {
      case 0:
      System.out.println("騎士になった");
      break;
      case 1:
      System.out.println("魔術師になった");
      break;
      case 2:
      System.out.println("戦士になった");
      break;
      case 3:
      System.out.println("盗賊になった");
      break;
      case 4:
      System.out.println("ギャンブラーになった");
      break;
    }
    try{
      Thread.sleep(2000);
    }catch(Exception ex){
      ex.printStackTrace();
    }
    System.out.println("初期ステータスを生成します");
    for(i=0;i<5;i++){
      firstst[i] = random.nextInt(11) + 5;
    }
    try{
      Thread.sleep(1000);
    }catch( Exception ex){
      ex.printStackTrace();
    }
    switch (num) {
      case 0:
      firstst[0] += 10;
      break;
      case 1:
      firstst[1] += 10;
      break;
      case 2:
      firstst[2] += 10;
      break;
      case 3:
      firstst[3] += 10;
      break;
      case 4:
      firstst[4] += 10;
      break;
    }
    String word;
    System.out.println("初期ステータスは");
    word = "HP: " + firstst[0];
    System.out.println(word);
    word = "MP: " + firstst[1];
    System.out.println(word);
    word = "POW: " + firstst[2];
    System.out.println(word);
    word = "DEX: " + firstst[3];
    System.out.println(word);
    word = "LUCK: " + firstst[4];
    System.out.println(word);

    int sum =0;
    for(i=0;i<5;i++){
      sum += firstst[i];
    }
    word = "総合値は " + sum;
    System.out.println(word);
    if(sum<50){
      System.out.println("あなたは見習い冒険者です");
    }else{
      if(sum<70){
        System.out.println("あなたは普通の冒険者です");
      }else{
        if(sum<85){
        System.out.println("あなたは期待の冒険者です");
      }else{
        System.out.println("あなたはチート級冒険者です");
      }
    }
  }
    try{
      Thread.sleep(2000);
    }catch(Exception ex){
      ex.printStackTrace();
   }
}
}

  

