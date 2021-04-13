package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemLongClickListener {

    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruit();
        FruitAdapter fruitAdapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView= findViewById(R.id.list_item);
        listView.setAdapter(fruitAdapter);
    }

    private void initFruit() {
        for (int i=0;i<10;i++){
            Fruit a=new Fruit("啊哈哈哈哈哈哈",R.drawable.a);
            fruitList.add(a);
            Fruit b=new Fruit("啊哈哈哈哈哈",R.drawable.b);
            fruitList.add(b);
            Fruit c=new Fruit("啊哈哈哈哈",R.drawable.c);
            fruitList.add(c);
            Fruit d=new Fruit("啊哈哈哈",R.drawable.d);
            fruitList.add(d);
        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        return false;
    }
}