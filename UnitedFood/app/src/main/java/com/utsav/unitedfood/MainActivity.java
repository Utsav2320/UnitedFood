package com.utsav.unitedfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import com.utsav.unitedfood.Adapter.ItemListAdapter;
import com.utsav.unitedfood.Model.ItemListModel;

import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;

public class MainActivity extends AppCompatActivity {
    DuoDrawerLayout drawerLayout;
    RecyclerView recyclerItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerItemList=findViewById(R.id.recyItemsList);

       ItemListModel[] itemListModel=new ItemListModel[]{
               new ItemListModel(R.drawable.hamburger,"Burger"),
               new ItemListModel(R.drawable.pizza,"Pizza"),
               new ItemListModel(R.drawable.french_fries,"French Fries"),
               new ItemListModel(R.drawable.maggie,"Maggie"),
               new ItemListModel(R.drawable.sandwich,"Sandwiches"),
               new ItemListModel(R.drawable.tostee,"Tostee"),
               new ItemListModel(R.drawable.tikka_pav,"Tikka Pao"),
       };

        ItemListAdapter itemListAdapter=new ItemListAdapter(itemListModel);
        recyclerItemList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerItemList.setAdapter(itemListAdapter);

        getNavigation();

    }
    @SuppressLint("RestrictedApi")
    private void getNavigation() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Monitaring");
        toolbar.setNavigationIcon(R.drawable.ic_baseline_home_24);
        setSupportActionBar(toolbar);
        CardView cardView=findViewById(R.id.cardMain);
        drawerLayout = (DuoDrawerLayout) findViewById(R.id.drawer);
        DuoDrawerToggle drawerToggle = new DuoDrawerToggle(this,drawerLayout,toolbar,
                nl.psdcompany.psd.duonavigationdrawer.R.string.navigation_drawer_open,
                nl.psdcompany.psd.duonavigationdrawer.R.string.navigation_drawer_close
        ) {
            @Override
            public void onDrawerSlide(View drawerView,float slideOffset) {
                float min = 0.9f;       //sidemenu height mentein
                float max = 1f;
                float scaleFactor = (max - ((max - min) * slideOffset));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    cardView.setScaleX(scaleFactor);
                    cardView.setScaleY(scaleFactor);
                }
            }
        };
        drawerLayout.setDrawerListener(drawerToggle);
        drawerLayout.setMarginFactor((float) 0.52);    //sidemenu width mentein
        drawerToggle.syncState();
    }
}