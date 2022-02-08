public class Team1 extends Team{
    public Team1(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Nikolas Kovacs"));
    }
}
