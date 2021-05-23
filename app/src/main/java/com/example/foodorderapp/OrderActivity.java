package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.OrderAdapter;
import com.example.foodorderapp.Models.OrdersModel;
import com.example.foodorderapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DBHelper helper = new DBHelper(this);

        ArrayList<OrdersModel> list=helper.getOrders();


//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));
//        list.add(new OrdersModel(R.drawable.food1,"Burger","4","56877558"));

        OrderAdapter adapter= new OrderAdapter(list,this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}