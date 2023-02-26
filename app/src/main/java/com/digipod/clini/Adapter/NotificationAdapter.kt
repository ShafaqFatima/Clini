package com.digipod.clini.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digipod.clini.ItemAnimation
import com.digipod.clini.R
import com.digipod.clini.Model.NotificationModel
import com.digipod.clini.OnClickListener
import com.digipod.clini.ViewHolder.NotificationViewHolder

class NotificationAdapter(private val notificationList: List<NotificationModel>, private val onClickListener: OnClickListener) :
    RecyclerView.Adapter<NotificationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.notification_layout, parent, false)
        return NotificationViewHolder(view,onClickListener)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val model: NotificationModel = notificationList[position]
        ItemAnimation.animateFadeIn(holder.itemView, position)
        holder.setNotificationData(model)
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

}