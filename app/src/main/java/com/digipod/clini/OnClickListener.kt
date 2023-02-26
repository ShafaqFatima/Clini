package com.digipod.clini

import com.digipod.clini.DoctorModel
import com.digipod.clini.Model.NotificationModel

interface OnClickListener {
    fun getData(position: Int, result: DoctorModel)
    fun readNotification(notificationModel: NotificationModel, position: Int)
}