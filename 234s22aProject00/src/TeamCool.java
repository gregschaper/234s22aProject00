
public class TeamCool extends Team
{
    public TeamCool(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Greg Schaper"));
        members.add(new TeamMember("Janice Jones"));
        members.add(new TeamMember("Harold Hero"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
