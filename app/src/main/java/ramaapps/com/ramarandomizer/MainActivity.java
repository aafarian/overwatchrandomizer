package ramaapps.com.ramarandomizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


    }

    //totalTextView = (TextView) findViewById(R.id.totalTextView);
    //numberTxt = (EditText) findViewById(R.id.numberTxt);

    @SuppressWarnings("unchecked")
    public void randomGo (View view)
    {

        final CheckBox offenseBox = (CheckBox) findViewById(R.id.offenseBox);
        final CheckBox defenseBox = (CheckBox) findViewById(R.id.defenseBox);
        final CheckBox tankBox = (CheckBox) findViewById(R.id.tankBox);
        final CheckBox supportBox = (CheckBox) findViewById(R.id.supportBox);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);


        ArrayList<Integer> heroes = new ArrayList<Integer>();

        if (offenseBox.isChecked())
        {

            heroes.add(0);
            heroes.add(1);
            heroes.add(2);
            heroes.add(3);
            heroes.add(4);
            heroes.add(5);

        }

        if (defenseBox.isChecked())
        {
            heroes.add(6);
            heroes.add(7);
            heroes.add(8);
            heroes.add(9);
            heroes.add(10);
            heroes.add(11);

        }

        if (tankBox.isChecked())
        {
            heroes.add(12);
            heroes.add(13);
            heroes.add(14);
            heroes.add(15);
            heroes.add(16);

        }

        if (supportBox.isChecked())
        {

            heroes.add(17);
            heroes.add(18);
            heroes.add(19);
            heroes.add(20);

        }

        if (heroes.isEmpty())
        {
            Toast toast = Toast.makeText(this, "Nothing checked", Toast.LENGTH_LONG);
            toast.show();

            return;
        }





        Random random = new Random();
        int randHero = random.nextInt(heroes.size());
        randHero = heroes.get(randHero);
        heroes.clear();

       // totalTextView.setText("Number = " + randHero);


        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("rH",randHero);

        startActivity(intent);
    }

    public void listGo (View view)
    {
        Intent intent = new Intent(this, heroList.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
