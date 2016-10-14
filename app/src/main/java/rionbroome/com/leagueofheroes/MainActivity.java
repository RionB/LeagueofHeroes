package rionbroome.com.leagueofheroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Hero> myDataset = new ArrayList<Hero>();


        Hero arrow = new Hero();
        arrow.Name = "Green Arrow";
        arrow.Desc = "Oliver Queen, best archer";
        myDataset.add(arrow);

        Hero flash = new Hero();
        flash.Name = "The Flash";
        flash.Desc = "Barry Allen, I am the fastest man alive";
        myDataset.add(flash);

        Hero lantern = new Hero();
        lantern.Name = "Green Lantern";
        lantern.Desc = "Hal Jordan, defender of the galaxy";
        myDataset.add(lantern);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new HeroAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
