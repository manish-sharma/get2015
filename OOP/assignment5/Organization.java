/**
 * Class that contains variable that stores information specific to an organization
 * @author Riddhi
 *
 */
public class Organization extends Entity {
	private String achievements;

	private String placements;

	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}

	public String getPlacements() {
		return placements;
	}

	public void setPlacements(String placements) {
		this.placements = placements;
	}

}
