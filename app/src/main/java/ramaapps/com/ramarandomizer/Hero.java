package ramaapps.com.ramarandomizer;

/**
 * Created by Anto on 5/27/2016.
 */
public class Hero {

    String name[] = {"Genji","McCree","Pharah","Reaper","Soldier: 76","Tracer","Bastion", "Hanzo",
            "Junkrat", "Mei", "Torbjörn", "Widowmaker", "D.Va", "Reinhardt", "Roadhog",
            "Winston", "Zarya", "Lúcio", "Mercy", "Symmetra", "Zenyatta"};
    int image[] = {R.drawable.offense_genji_hero, R.drawable.offense_mccree_hero, R.drawable.offense_pharah_hero,
            R.drawable.offense_reaper_hero, R.drawable.offense_soldier76_hero, R.drawable.offense_tracer_hero,
            R.drawable.defense_bastion_hero, R.drawable.defense_hanzo_hero, R.drawable.defense_junkrat_hero,
            R.drawable.defense_mei_hero, R.drawable.defense_torbjorn_hero, R.drawable.defense_widowmaker_hero,
            R.drawable.tank_dva_hero, R.drawable.tank_reinhardt_hero, R.drawable.tank_roadhog_hero, R.drawable.tank_winston_hero,
            R.drawable.tank_zarya_hero, R.drawable.support_lucio_hero, R.drawable.support_mercy_hero, R.drawable.support_symmetra_hero, R.drawable.support_zenyatta_hero};

    int detail[] = {R.drawable.offense_genji_skills, R.drawable.offense_mccree_skills, R.drawable.offense_pharah_skills,
            R.drawable.offense_reaper_skills, R.drawable.offense_soldier76_skills, R.drawable.offense_tracer_skills, R.drawable.defense_bastion_skills,
            R.drawable.defense_hanzo_skills, R.drawable.defense_junkrat_skills, R.drawable.defense_mei_skills, R.drawable.defense_torbjorn_skills,
            R.drawable.defense_widowmaker_skills, R.drawable.tank_dva_skills, R.drawable.tank_reinhardt_skills, R.drawable.tank_roadhog_skills,
            R.drawable.tank_winston_skills, R.drawable.tank_zarya_skills, R.drawable.support_lucio_skills, R.drawable.support_mercy_skills,
            R.drawable.support_symmetra_skills, R.drawable.support_zenyatta_skills};

    int roleIcon[] = {R.drawable.offense_icon, R.drawable.offense_icon, R.drawable.offense_icon, R.drawable.offense_icon, R.drawable.offense_icon,
            R.drawable.offense_icon, R.drawable.defense_icon, R.drawable.defense_icon, R.drawable.defense_icon, R.drawable.defense_icon, R.drawable.defense_icon,
            R.drawable.defense_icon, R.drawable.tank_icon, R.drawable.tank_icon, R.drawable.tank_icon, R.drawable.tank_icon, R.drawable.tank_icon,
            R.drawable.support_icon, R.drawable.support_icon, R.drawable.support_icon, R.drawable.support_icon};

    String roleTxt[] = {"Offense", "Offense", "Offense", "Offense", "Offense", "Offense", "Defense", "Defense", "Defense", "Defense", "Defense", "Defense",
            "Tank", "Tank", "Tank", "Tank", "Tank", "Support", "Support", "Support", "Support"};

    private String instanceName;
    private int instanceImage;
    private int instanceDetail;
    private int instanceRoleIcon;
    private String instanceRoleTxt;

    public Hero (int rH)
    {
        this.instanceName = name[rH];
        this.instanceImage = image[rH];
        this.instanceDetail = detail[rH];
        this.instanceRoleIcon = roleIcon[rH];
        this.instanceRoleTxt = roleTxt[rH];
    }

    public String getName()
    {
        return instanceName;
    }
    public int getImage()
    {
        return instanceImage;
    }
    public int getDetail()
    {
        return instanceDetail;
    }
    public int getRoleIcon() { return instanceRoleIcon; }
    public String getRoleTxt() { return instanceRoleTxt; }
}
