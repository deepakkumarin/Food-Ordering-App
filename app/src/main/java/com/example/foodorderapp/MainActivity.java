package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list= new ArrayList<>();

        list.add(new MainModel(R.drawable.food1,"Burger","5","Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.food2,"Pastries","0","Limited Period Offer"));
        list.add(new MainModel(R.drawable.food3,"cake","7","Sweet chocolate cakes"));
        list.add(new MainModel(R.drawable.food4,"Green Salad Burger","10","Green cheese chicken Burger includes healthy Ingredients"));
        list.add(new MainModel(R.drawable.food6,"Ice-Cream","3","A rich, sweet, creamy frozen milk ice cream"));
        list.add(new MainModel(R.drawable.food7,"Bread cheese Strawberry","3","A rich, sweet, creamy frozen milk ice cream"));
        list.add(new MainModel(R.drawable.food8,"Pizza","3","A rich, sweet, creamy frozen milk ice cream"));
        list.add(new MainModel(R.drawable.food9,"margheritta pizza","3","A rich, sweet, creamy frozen milk ice cream"));
        list.add(new MainModel(R.drawable.food10,"Mix salad","3","A rich, sweet, creamy frozen milk ice cream"));
        list.add(new MainModel(R.drawable.food11,"Lemon chicken salad","3","A rich, sweet, creamy frozen milk ice cream"));
        list.add(new MainModel(R.drawable.food12,"Bread Toast Peanut butter","3","A rich, sweet, creamy frozen milk ice cream"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}