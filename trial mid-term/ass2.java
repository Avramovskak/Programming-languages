import java.util.Random;

class Player {
    private String name;
    private int points;
    private String team;

    public Player(String name, String team) {
        this.name = name;
        this.team = team;
        this.points = (int) (Math.random() * 100) % 50;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getTeam() {
        return team;
    }
}

public class Ass2 {
    public static Player MVP(Player[] players) {
        Player mvp = players[0];
        int maxPoints = players[0].getPoints();

        for (Player player : players) {
            if (player.getPoints() > maxPoints) {
                maxPoints = player.getPoints();
                mvp = player;
            }
        }

        return mvp;
    }

    public static void main(String[] args) {
        Player[] miamiHeat = new Player[5];
        Player[] laLakers = new Player[5];

        for (int i = 0; i < 5; i++) {
            miamiHeat[i] = new Player("Player_" + i, "Miami Heat");
            laLakers[i] = new Player("Player_" + i, "L.A. Lakers");
        }

        int miamiHeatTotalPoints = 0;
        int laLakersTotalPoints = 0;

        System.out.println("Miami Heat");
        for (Player player : miamiHeat) {
            System.out.println(player.getName() + " " + player.getPoints() + " points");
            miamiHeatTotalPoints += player.getPoints();
        }

        System.out.println("L.A. Lakers");
        for (Player player : laLakers) {
            System.out.println(player.getName() + " " + player.getPoints() + " points");
            laLakersTotalPoints += player.getPoints();
        }

        System.out.println("Miami Heat: L.A. Lakers = " + miamiHeatTotalPoints + " : " + laLakersTotalPoints + ".");

        if (miamiHeatTotalPoints > laLakersTotalPoints) {
            System.out.println("The winner is Miami Heat");
        } else if (miamiHeatTotalPoints < laLakersTotalPoints) {
            System.out.println("The winner is L.A. Lakers");
        } else {
            System.out.println("It's a tie!");
        }

        Player mvp = MVP(new Player[] {MVP(miamiHeat), MVP(laLakers)});

        System.out.println("MVP is " + mvp.getName() + " from " + mvp.getTeam() + " with " + mvp.getPoints() + " points");
    }
}
