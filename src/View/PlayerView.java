package View;

import Model.Player;
import java.util.List;

public class PlayerView {

    public void displayPlayer(Player player) {
        System.out.println("Player ID: " + player.getId());
        System.out.println("Name     : " + player.getName());
        System.out.println("Team     : " + player.getTeam());
        System.out.println("Role     : " + player.getRole());
        System.out.println("Runs     : " + player.getRuns());
        System.out.println("Wickets  : " + player.getWickets());
        System.out.println("-----------------------------------");
    }

    public void displayTeam(List<Player> players, String teamName) {
        System.out.println("=== Team: " + teamName + " ===");
        for (Player p : players) {
            if (p.getTeam().equalsIgnoreCase(teamName)) {
                System.out.println(p.getName() + " (" + p.getRole() + ") - Runs: " + p.getRuns() + ", Wickets: " + p.getWickets());
            }
        }
        System.out.println("-----------------------------------");
    }

    public void displayTopScorer(Player player) {
        System.out.println("🏏 Top Scorer: " + player.getName() + " (" + player.getTeam() + ") - " + player.getRuns() + " runs");
    }

    public void displayTopWicketTaker(Player player) {
        System.out.println("🎯 Top Wicket-Taker: " + player.getName() + " (" + player.getTeam() + ") - " + player.getWickets() + " wickets");
    }
}
