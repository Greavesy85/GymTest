package com.binlid.gymlogger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrontPage extends AppCompatActivity {

    static final exercise_list exerciseList = new exercise_list();

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        //exerciseList = new exercise_list();

        final ListView lv = (ListView)findViewById(R.id.lView);

        final ArrayAdapter<exercise> arrayAdapter = new ArrayAdapter<exercise>(this, R.layout.support_simple_spinner_dropdown_item, exerciseList.exerciseList);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                exercise selected = (exercise)lv.getItemAtPosition(i);

                Intent intent = new Intent(getBaseContext(), ExcerciseInfoPage.class);
                //intent.putExtra("exer", exerciseList.exerciseList.get(selected.Name));
                intent.putExtra("exer", selected);

                startActivity(intent);

            }
        });

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.elview);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        //buttonPress();
        //buttonPress2();

    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Top 250");
        listDataHeader.add("Now Showing");
        listDataHeader.add("Coming Soon..");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("The Shawshank Redemption");
        top250.add("The Godfather");
        top250.add("The Godfather: Part II");
        top250.add("Pulp Fiction");
        top250.add("The Good, the Bad and the Ugly");
        top250.add("The Dark Knight");
        top250.add("12 Angry Men");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_front_page, menu);
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

    /*public void buttonPress()
    {

        //final TextView testText = (TextView) findViewById(R.id.TestText);
        //Button changeTextButton = (Button) findViewById(R.id.TestButton);

        /*changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                testText.setText("BobbyMcBob");

                Intent intent = new Intent(getBaseContext(), ExcerciseInfoPage.class);
                intent.putExtra("exer", exerciseList.exerciseList.get("LegPress"));

                startActivity(intent);

            }
        });


    }

    public void buttonPress2()
    {

        /*final TextView testText = (TextView) findViewById(R.id.TestText);
        Button changeTextButton = (Button) findViewById(R.id.button2);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                testText.setText("BobbyMcBob");

                Intent intent = new Intent(getBaseContext(), ExcerciseInfoPage.class);
                intent.putExtra("exer", exerciseList.exerciseList.get("Curl"));

                startActivity(intent);
            }
        });


    }*/
}
