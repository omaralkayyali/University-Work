import java.util.ArrayList;

public class ProgrammingContest extends Contest {
    private ArrayList<Team> teams;

    public ProgrammingContest() {
        super();
        teams = new ArrayList<>();
    }

    public ProgrammingContest(String name, char level, String location) {
        super(name, level, location);
        teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        if (team != null) {
            teams.add(team);
        }
    }

    public boolean removeTeam(int id) {
        return teams.removeIf(team -> team.getId() == id);
    }

    public Team searchTeamByName(String name) {
        for (Team team : teams) {
            if (team.getName().equalsIgnoreCase(name)) {
                return team;
            }
        }
        return null;
    }

    public void displayAllTeams() {
        System.out.println("\\n=== Teams in " + getName() + " ===");
        if (teams.isEmpty()) {
            System.out.println("No teams currently registered.");
            return;
        }
        for (Team team : teams) {
            System.out.println(team.getTeamInfo());
        }
    }

    public int getTeamCount() {
        return teams.size();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Teams=%d", getTeamCount());
    }
}
