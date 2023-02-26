package com.digipod.clini.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digipod.clini.R
import com.digipod.clini.Model.ExploreCategoryModel

import com.digipod.clini.ViewHolder.CategoryViewHolder

class ExploreCategoryAdapter(private val categoryList: List<ExploreCategoryModel>) :
    RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.explore_more_category_layout, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val model = categoryList[position]
        holder.setCategoryData(model)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}