public class Team {
    private int id;
    private String name;
    private int members;

    public Team() {
        this.id = 1;
        this.name = "@Team1";
        this.members = 3;
    }

    public Team(int id, String name, int members) {
        setId(id);
        setName(name);
        setMembers(members);
    }

    public void setId(int id) {
        if (id >= 1) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be a positive integer starting at 1.");
        }
    }

    public void setName(String name) {
        if (name != null && name.startsWith("@") && name.length() <= 10 && name.length() > 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must begin with '@' and contain 2 to 10 characters.");
        }
    }

    public void setMembers(int members) {
        if (members >= 3 && members <= 5) {
            this.members = members;
        } else {
            throw new IllegalArgumentException("Members must be between 3 and 5.");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMembers() {
        return members;
    }

    public String getTeamInfo() {
        return String.format("★ Team ID: %d | Name: %s | Members: %d", id, name, members);
    }

    @Override
    public String toString() {
        return String.format("Team [id=%d, name=%s, members=%d]", id, name, members);
    }
}
