/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

public class App {
  public String getGreeting() {

    int ID = 10;
    String word = "こんにちは SEMonster あなたのIDは" + ID;
    return word;
  }

  public String getEnding() {
    String end = "遊んでくれてありがとう！";
    return end;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    Status job = new Status();
    job.Job();
    Monster monster = new Monster();
    monster.drawMonsters();
    monster.showDeck();

    System.out.println(new App().getEnding());

  }

}
