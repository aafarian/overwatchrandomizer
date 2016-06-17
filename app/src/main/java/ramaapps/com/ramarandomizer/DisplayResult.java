package ramaapps.com.ramarandomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Bundle info = getIntent().getExtras();
        int randHero = info.getInt("rH");

        TextView heroName = (TextView) findViewById(R.id.heroName);
        ImageView heroImage = (ImageView) findViewById(R.id.heroImage);
        ImageView heroSkills = (ImageView) findViewById(R.id.heroSkills);
        ImageView heroRoleIcon = (ImageView) findViewById(R.id.heroRoleIcon);
        TextView heroRoleTxt = (TextView) findViewById(R.id.heroRoleTxt);


        Hero newHero = new Hero(randHero);

        heroName.setText(newHero.getName());
        heroImage.setImageResource(newHero.getImage());
        heroSkills.setImageResource(newHero.getDetail());
        heroRoleIcon.setImageResource(newHero.getRoleIcon());
        heroRoleTxt.setText(newHero.getRoleTxt());





    }

    public void goBack(View view)
    {
        this.finish();
    }



}
