package semonster2;
import java.util.ArrayList;
import java.util.Random;

public class Monster {
  String name;
  int lv,r;
  ArrayList<Monster> deck = new ArrayList<>();

  Monster() {
    Random random = new Random();
    r = random.nextInt(100);
    this.name = this.summonMonster(random.nextInt(5));
    this.lv = random.nextInt(5);
    if(r <= 5){
      while(this.lv < 50){
    this.lv = random.nextInt(99);
      }
    }else{
      this.lv = random.nextInt(10);
    }
    
  }

  String summonMonster(int mnumber) {
    if(r <= 5){
    String monsters2[] = {"BOSS赤","BOSS青","BOSS黄色","BOSS黒","BOSS黄" };
    return monsters2[mnumber];
    }else{
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
    }
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.deck.add(new Monster());
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

  @Override
  public String toString() {

    return this.name + ":LV[" + this.lv + "]";
  }
}