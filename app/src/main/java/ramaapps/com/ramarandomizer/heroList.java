package ramaapps.com.ramarandomizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class heroList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_list);


    }

    public void selectAllGo(View view) {
        final CheckBox offenseCheck = (CheckBox) findViewById(R.id.offenseCheck);
        final CheckBox defenseCheck = (CheckBox) findViewById(R.id.defenseCheck);
        final CheckBox tankCheck = (CheckBox) findViewById(R.id.tankCheck);
        final CheckBox supportCheck = (CheckBox) findViewById(R.id.supportCheck);
        final CheckBox genji_checkbox = (CheckBox) findViewById(R.id.genji_checkbox);
        final CheckBox mccree_checkbox = (CheckBox) findViewById(R.id.mccree_checkbox);
        final CheckBox pharah_checkbox = (CheckBox) findViewById(R.id.pharah_checkbox);
        final CheckBox reaper_checkbox = (CheckBox) findViewById(R.id.reaper_checkbox);
        final CheckBox soldier76_checkbox = (CheckBox) findViewById(R.id.soldier76_checkbox);
        final CheckBox tracer_checkbox = (CheckBox) findViewById(R.id.tracer_checkbox);
        final CheckBox bastion_checkbox = (CheckBox) findViewById(R.id.bastion_checkbox);
        final CheckBox hanzo_checkbox = (CheckBox) findViewById(R.id.hanzo_checkbox);
        final CheckBox junkrat_checkbox = (CheckBox) findViewById(R.id.junkrat_checkbox);
        final CheckBox mei_checkbox = (CheckBox) findViewById(R.id.mei_checkbox);
        final CheckBox torbjorn_checkbox = (CheckBox) findViewById(R.id.torbjorn_checkbox);
        final CheckBox widowmaker_checkbox = (CheckBox) findViewById(R.id.widowmaker_checkbox);
        final CheckBox dva_checkbox = (CheckBox) findViewById(R.id.dva_checkbox);
        final CheckBox reinhardt_checkbox = (CheckBox) findViewById(R.id.reinhardt_checkbox);
        final CheckBox roadhog_checkbox = (CheckBox) findViewById(R.id.roadhog_checkbox);
        final CheckBox winston_checkbox = (CheckBox) findViewById(R.id.winston_checkbox);
        final CheckBox zarya_checkbox = (CheckBox) findViewById(R.id.zarya_checkbox);
        final CheckBox lucio_checkbox = (CheckBox) findViewById(R.id.lucio_checkbox);
        final CheckBox mercy_checkbox = (CheckBox) findViewById(R.id.mercy_checkbox);
        final CheckBox symmetra_checkbox = (CheckBox) findViewById(R.id.symmetra_checkbox);
        final CheckBox zenyatta_checkbox = (CheckBox) findViewById(R.id.zenyatta_checkbox);

        final android.widget.CheckBox[] cBoxName = {offenseCheck, defenseCheck, tankCheck, supportCheck, genji_checkbox, mccree_checkbox, pharah_checkbox, reaper_checkbox, soldier76_checkbox, tracer_checkbox, bastion_checkbox, hanzo_checkbox,
                junkrat_checkbox, mei_checkbox, torbjorn_checkbox, widowmaker_checkbox, dva_checkbox, reinhardt_checkbox, roadhog_checkbox,
                winston_checkbox, zarya_checkbox, lucio_checkbox, mercy_checkbox, symmetra_checkbox, zenyatta_checkbox};

        final int size = cBoxName.length;


        for (int i = 0; i < size; i++) {
            if (!cBoxName[i].isChecked())
            {
                cBoxName[i].setChecked(true);
            }

        }
    }

    public void deselectAllGo(View view) {
        final CheckBox offenseCheck = (CheckBox) findViewById(R.id.offenseCheck);
        final CheckBox defenseCheck = (CheckBox) findViewById(R.id.defenseCheck);
        final CheckBox tankCheck = (CheckBox) findViewById(R.id.tankCheck);
        final CheckBox supportCheck = (CheckBox) findViewById(R.id.supportCheck);
        final CheckBox genji_checkbox = (CheckBox) findViewById(R.id.genji_checkbox);
        final CheckBox mccree_checkbox = (CheckBox) findViewById(R.id.mccree_checkbox);
        final CheckBox pharah_checkbox = (CheckBox) findViewById(R.id.pharah_checkbox);
        final CheckBox reaper_checkbox = (CheckBox) findViewById(R.id.reaper_checkbox);
        final CheckBox soldier76_checkbox = (CheckBox) findViewById(R.id.soldier76_checkbox);
        final CheckBox tracer_checkbox = (CheckBox) findViewById(R.id.tracer_checkbox);
        final CheckBox bastion_checkbox = (CheckBox) findViewById(R.id.bastion_checkbox);
        final CheckBox hanzo_checkbox = (CheckBox) findViewById(R.id.hanzo_checkbox);
        final CheckBox junkrat_checkbox = (CheckBox) findViewById(R.id.junkrat_checkbox);
        final CheckBox mei_checkbox = (CheckBox) findViewById(R.id.mei_checkbox);
        final CheckBox torbjorn_checkbox = (CheckBox) findViewById(R.id.torbjorn_checkbox);
        final CheckBox widowmaker_checkbox = (CheckBox) findViewById(R.id.widowmaker_checkbox);
        final CheckBox dva_checkbox = (CheckBox) findViewById(R.id.dva_checkbox);
        final CheckBox reinhardt_checkbox = (CheckBox) findViewById(R.id.reinhardt_checkbox);
        final CheckBox roadhog_checkbox = (CheckBox) findViewById(R.id.roadhog_checkbox);
        final CheckBox winston_checkbox = (CheckBox) findViewById(R.id.winston_checkbox);
        final CheckBox zarya_checkbox = (CheckBox) findViewById(R.id.zarya_checkbox);
        final CheckBox lucio_checkbox = (CheckBox) findViewById(R.id.lucio_checkbox);
        final CheckBox mercy_checkbox = (CheckBox) findViewById(R.id.mercy_checkbox);
        final CheckBox symmetra_checkbox = (CheckBox) findViewById(R.id.symmetra_checkbox);
        final CheckBox zenyatta_checkbox = (CheckBox) findViewById(R.id.zenyatta_checkbox);

        final android.widget.CheckBox[] cBoxName = {offenseCheck, defenseCheck, tankCheck, supportCheck, genji_checkbox, mccree_checkbox, pharah_checkbox, reaper_checkbox, soldier76_checkbox, tracer_checkbox, bastion_checkbox, hanzo_checkbox,
                junkrat_checkbox, mei_checkbox, torbjorn_checkbox, widowmaker_checkbox, dva_checkbox, reinhardt_checkbox, roadhog_checkbox,
                winston_checkbox, zarya_checkbox, lucio_checkbox, mercy_checkbox, symmetra_checkbox, zenyatta_checkbox};

        final int size = cBoxName.length;

        for (int i = 0; i < size; i++) {
            if (cBoxName[i].isChecked())
            {
                cBoxName[i].setChecked(false);
            }

        }


    }

    public void roleCheckOffense(View view) {
        final CheckBox offenseCheck = (CheckBox) findViewById(R.id.offenseCheck);
        final CheckBox genji_checkbox = (CheckBox) findViewById(R.id.genji_checkbox);
        final CheckBox mccree_checkbox = (CheckBox) findViewById(R.id.mccree_checkbox);
        final CheckBox pharah_checkbox = (CheckBox) findViewById(R.id.pharah_checkbox);
        final CheckBox reaper_checkbox = (CheckBox) findViewById(R.id.reaper_checkbox);
        final CheckBox soldier76_checkbox = (CheckBox) findViewById(R.id.soldier76_checkbox);
        final CheckBox tracer_checkbox = (CheckBox) findViewById(R.id.tracer_checkbox);


        final android.widget.CheckBox[] cBoxName = {genji_checkbox, mccree_checkbox, pharah_checkbox, reaper_checkbox, soldier76_checkbox, tracer_checkbox};


        if (offenseCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(true);
            }
        }

        if (!offenseCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(false);
            }
        }

    }


    public void roleCheckDefense(View view) {
        final CheckBox defenseCheck = (CheckBox) findViewById(R.id.defenseCheck);
        final CheckBox bastion_checkbox = (CheckBox) findViewById(R.id.bastion_checkbox);
        final CheckBox hanzo_checkbox = (CheckBox) findViewById(R.id.hanzo_checkbox);
        final CheckBox junkrat_checkbox = (CheckBox) findViewById(R.id.junkrat_checkbox);
        final CheckBox mei_checkbox = (CheckBox) findViewById(R.id.mei_checkbox);
        final CheckBox torbjorn_checkbox = (CheckBox) findViewById(R.id.torbjorn_checkbox);
        final CheckBox widowmaker_checkbox = (CheckBox) findViewById(R.id.widowmaker_checkbox);


        final android.widget.CheckBox[] cBoxName = {bastion_checkbox, hanzo_checkbox,
                junkrat_checkbox, mei_checkbox, torbjorn_checkbox, widowmaker_checkbox};


        if (defenseCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(true);
            }
        }

        if (!defenseCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(false);
            }
        }

    }


    public void roleCheckTank(View view) {
        final CheckBox tankCheck = (CheckBox) findViewById(R.id.tankCheck);
        final CheckBox dva_checkbox = (CheckBox) findViewById(R.id.dva_checkbox);
        final CheckBox reinhardt_checkbox = (CheckBox) findViewById(R.id.reinhardt_checkbox);
        final CheckBox roadhog_checkbox = (CheckBox) findViewById(R.id.roadhog_checkbox);
        final CheckBox winston_checkbox = (CheckBox) findViewById(R.id.winston_checkbox);
        final CheckBox zarya_checkbox = (CheckBox) findViewById(R.id.zarya_checkbox);


        final android.widget.CheckBox[] cBoxName = {dva_checkbox, reinhardt_checkbox, roadhog_checkbox,
                winston_checkbox, zarya_checkbox};


        if (tankCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(true);
            }
        }

        if (!tankCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(false);
            }
        }

    }


    public void roleCheckSupport(View view) {
        final CheckBox supportCheck = (CheckBox) findViewById(R.id.supportCheck);
        final CheckBox lucio_checkbox = (CheckBox) findViewById(R.id.lucio_checkbox);
        final CheckBox mercy_checkbox = (CheckBox) findViewById(R.id.mercy_checkbox);
        final CheckBox symmetra_checkbox = (CheckBox) findViewById(R.id.symmetra_checkbox);
        final CheckBox zenyatta_checkbox = (CheckBox) findViewById(R.id.zenyatta_checkbox);


        final android.widget.CheckBox[] cBoxName = {lucio_checkbox, mercy_checkbox, symmetra_checkbox, zenyatta_checkbox};


        if (supportCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(true);
            }
        }

        if (!supportCheck.isChecked()) {
            for (int i = 0; i < cBoxName.length; i++) {
                cBoxName[i].setChecked(false);
            }
        }

    }


    public void goBack(View view) {
        this.finish();
    }


    public void randomGoCustom(View view)
    {

        final CheckBox genji_checkbox = (CheckBox) findViewById(R.id.genji_checkbox);
        final CheckBox mccree_checkbox = (CheckBox) findViewById(R.id.mccree_checkbox);
        final CheckBox pharah_checkbox = (CheckBox) findViewById(R.id.pharah_checkbox);
        final CheckBox reaper_checkbox = (CheckBox) findViewById(R.id.reaper_checkbox);
        final CheckBox soldier76_checkbox = (CheckBox) findViewById(R.id.soldier76_checkbox);
        final CheckBox tracer_checkbox = (CheckBox) findViewById(R.id.tracer_checkbox);
        final CheckBox bastion_checkbox = (CheckBox) findViewById(R.id.bastion_checkbox);
        final CheckBox hanzo_checkbox = (CheckBox) findViewById(R.id.hanzo_checkbox);
        final CheckBox junkrat_checkbox = (CheckBox) findViewById(R.id.junkrat_checkbox);
        final CheckBox mei_checkbox = (CheckBox) findViewById(R.id.mei_checkbox);
        final CheckBox torbjorn_checkbox = (CheckBox) findViewById(R.id.torbjorn_checkbox);
        final CheckBox widowmaker_checkbox = (CheckBox) findViewById(R.id.widowmaker_checkbox);
        final CheckBox dva_checkbox = (CheckBox) findViewById(R.id.dva_checkbox);
        final CheckBox reinhardt_checkbox = (CheckBox) findViewById(R.id.reinhardt_checkbox);
        final CheckBox roadhog_checkbox = (CheckBox) findViewById(R.id.roadhog_checkbox);
        final CheckBox winston_checkbox = (CheckBox) findViewById(R.id.winston_checkbox);
        final CheckBox zarya_checkbox = (CheckBox) findViewById(R.id.zarya_checkbox);
        final CheckBox lucio_checkbox = (CheckBox) findViewById(R.id.lucio_checkbox);
        final CheckBox mercy_checkbox = (CheckBox) findViewById(R.id.mercy_checkbox);
        final CheckBox symmetra_checkbox = (CheckBox) findViewById(R.id.symmetra_checkbox);
        final CheckBox zenyatta_checkbox = (CheckBox) findViewById(R.id.zenyatta_checkbox);

        final android.widget.CheckBox[] cBoxName = {genji_checkbox, mccree_checkbox, pharah_checkbox, reaper_checkbox, soldier76_checkbox, tracer_checkbox, bastion_checkbox, hanzo_checkbox,
                junkrat_checkbox, mei_checkbox, torbjorn_checkbox, widowmaker_checkbox, dva_checkbox, reinhardt_checkbox, roadhog_checkbox,
                winston_checkbox, zarya_checkbox, lucio_checkbox, mercy_checkbox, symmetra_checkbox, zenyatta_checkbox};

        final int size = cBoxName.length;

        ArrayList<Integer> heroes2 = new ArrayList<Integer>();

        for (int i=0; i<size; i++)
        {
            if (cBoxName[i].isChecked())
            {
                heroes2.add(i);
            }
        }


        if (heroes2.isEmpty())
        {
            Toast toast = Toast.makeText(this, "Nothing checked", Toast.LENGTH_LONG);
            toast.show();

            return;
        }

        Random random = new Random();
        int randHero2 = random.nextInt(heroes2.size());
        randHero2 = heroes2.get(randHero2);
        heroes2.clear();

        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("rH",randHero2);

        startActivity(intent);





    }




}
