package com.vinayreddy.movielist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.vinayreddy.movielist.R.id.image;
import static com.vinayreddy.movielist.R.id.select_dialog;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    //declaring
    ListView select;
    ImageView logo;
    TextView name,rating,description;

    String[] movieArray = {"krishna with his lella","Arjun Reddy","ee Ngaraniki Em Ayyindi","3 Idiots","Fast and Furious 9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning values by the id for image and texts
        logo=findViewById(R.id.imageViewLogo);
        name=findViewById(R.id.textViewName);
        rating=findViewById(R.id.textViewRating);
        description=findViewById(R.id.textViewDescription);

        //assigning values by id for listview
       select=findViewById(select_dialog);

       //adding movie names to the array adapter
        String[] movies;
        movies = new String[]{"krishna with his leela","Arjun Reddy","ee nagaraniki em ayyindi","3 Idiots","Bahubali"};
        ArrayAdapter<String> moviesAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,movies);

        select.setAdapter(moviesAdapter);
        //creating a listener for showing the results
        select.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String movie = parent.getItemAtPosition(position).toString();
        //using if statements for showing required movie details
        if(movie == "krishna with his leela"){
            logo.setImageResource(R.drawable.one);
            name.setText("Krishna with his leela");
            rating.setText("* * * * (4/5)");
            description.setText("Torn between his past and present girlfriends, a confused bachelor’s indecisiveness spins a web of lies and cheating as he struggles to commit.");
        }
        if(movie == "Arjun Reddy"){
            logo.setImageResource(R.drawable.two);
            name.setText("Arjun Reddy");
            rating.setText("* * * * *(5/5)");
            description.setText("Arjun Reddy, a short tempered house surgeon gets used to drugs and drinks when his girlfriend is forced to marry another person.");
        }
        if(movie == "ee nagaraniki em ayyindi"){
            logo.setImageResource(R.drawable.three);
            name.setText("Ee nagaraniki em ayyindi");
            rating.setText("* * * * (4/5)");
            description.setText("In Goa and in desperate need of cash, four childhood friends get another shot at making their long-abandoned dreams of becoming filmmakers come true.");
        }
        if(movie == "3 Idiots"){
            logo.setImageResource(R.drawable.four);
            name.setText("3 Idiots");
            rating.setText("* * * * * (5/5)");
            description.setText("Two friends are searching for their long lost companion. They revisit their college days and recall the memories of their friend who inspired them to think differently, even as the rest of the world called them \"idiots\".");
        }
        if(movie == "Bahubali"){
            logo.setImageResource(R.drawable.five);
            name.setText("Bahubali");
            rating.setText("* * * * * (5/5)");
            description.setText("In ancient India, an adventurous and daring man becomes involved in a decades old feud between two warring people.");
        }
    }
}