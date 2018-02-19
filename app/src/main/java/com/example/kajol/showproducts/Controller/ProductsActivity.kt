package com.example.kajol.showproducts.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.kajol.showproducts.Adapter.ProductsRecyclerAdapter
import com.example.kajol.showproducts.R
import com.example.kajol.showproducts.Services.DataService
import com.example.kajol.showproducts.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsRecyclerAdapter(this, DataService.getProducts(categoryType))

        val orientation = resources.configuration.orientation

        var spanCount = 2;

        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3;
        }

        val layoutManager = GridLayoutManager(this,spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
