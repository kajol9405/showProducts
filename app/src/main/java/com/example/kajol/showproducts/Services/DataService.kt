package com.example.kajol.showproducts.Services

import com.example.kajol.showproducts.Model.Category
import com.example.kajol.showproducts.Model.Product

/**
 * Created by Kajol on 2/18/2018.
 */
object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(

            Product("Developers", "$18","hat1"),
            Product("Designers", "$20","hat2"),
            Product("Analyst", "$16","hat3"),
            Product("QA", "$21","hat4")
    )

    val hoodies = listOf(

            Product("Developers red", "$28","hoodie1"),
            Product("Designers black", "$30","hoodie2"),
            Product("Analyst white", "$26","hoodie3"),
            Product("QA brown", "$31","hoodie4")
    )

    val shirts = listOf(

            Product("Developers shirt red", "$18","shirt1"),
            Product("Designers shirt black", "$10","shirt2"),
            Product("Analyst shirt white", "$16","shirt3"),
            Product("QA shirt brown", "$11","shirt4"),
            Product("web shirt brown", "$11","shirt5")
    )
    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        when(category){
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood

        }
    }
}