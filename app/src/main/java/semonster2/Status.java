package semonster2;

import java.util.Scanner;

public class Status {

  public void Job() {
    int flag = 1;
    int count = 0;
    System.out.println("役職を選択してください");
    System.out.println("1.騎士:HPが高い");
    System.out.println("2.魔術師:MPが高い");
    System.out.println("3.戦士:攻撃力が高い");
    System.out.println("4.盗賊:素早さが高い");
    System.out.println("5.ギャンブラー:運が高い");

    while (flag == 1) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("1～5の数字を入力してください");
      int num = scanner.nextInt();
      scanner.close();
      if (count > 3) {
        System.out.println("無職になった");
        flag = 0;
      }
      if (num > 0) {
        if (num < 6) {
          switch (num) {
            case 1:
              System.out.println("騎士になった");
              flag = 0;
              break;
            case 2:
              System.out.println("魔術師になった");
              flag = 0;
              break;
            case 3:
              System.out.println("戦士になった");
              flag = 0;
              break;
            case 4:
              System.out.println("盗賊になった");
              flag = 0;
              break;
            case 5:
              System.out.println("ギャンブラーになった");
              flag = 0;
              break;
          }
        } else {
          count++;
          System.out.println("そのような役職は存在しません");
        }
      } else {
        count++;
        System.out.println("そのような役職は存在しません");
      }
    }
  }
}
