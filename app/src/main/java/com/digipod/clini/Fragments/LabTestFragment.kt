package com.digipod.clini.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.digipod.clini.R
import com.digipod.clini.MainActivity
import kotlinx.android.synthetic.main.fragment_lab_test.*


class LabTestFragment : Fragment(R.layout.fragment_lab_test) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadSource()

        ibBackLabTest.setOnClickListener{
            val intent= Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun loadSource() {

        Glide.with(new_launch).load("https://i.postimg.cc/J0YKJtWQ/new-launch.jpg").into(new_launch)
        Glide.with(body_check).load("https://i.postimg.cc/02rVvGpX/body-check.jpg").into(body_check)
        Glide.with(pcr_test).load("https://i.postimg.cc/FscmvPwD/pcr-test.jpg").into(pcr_test)
        Glide.with(care_plush).load("https://i.postimg.cc/C5xmzk91/care-plush.jpg").into(care_plush)
     //   Glide.with(advance_full_body_check).load("https://i.postimg.cc/q7wjJ9Kd/advance-full-body-check.jpg").into(advance_full_body_check)
      // Glide.with(covid_test).load("https://i.postimg.cc/zvbjkvcJ/covide-test.jpg").into(covid_test)
     //   Glide.with(men_body_check).load("https://i.postimg.cc/zBfpV0wH/men-body-check.jpg").into(men_body_check)
//        Glide.with(women_body_check).load("https://i.postimg.cc/KzsfLBQq/women-body-check.jpg").into(women_body_check)
    }

}
/**
Glide template=>    Glide.with().load().into()
 */