package com.cbstudio.everytarget.main.home.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.cbstudio.everytarget.R
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tool_bar.inflateMenu(android.R.menu.)
        setSupportActionBar(tool_bar)
        tool_bar.setTitle(R.string.title_main)
//        tool_bar.setTitleTextColor(R.color.title_main)

        var array = ArrayList<PieEntry>()
        array.add(PieEntry(4f, "Nice"))
        array.add(PieEntry(8f, "Nice2"))
        array.add(PieEntry(6f, 0f))
        array.add(PieEntry(12f, 0f))
        array.add(PieEntry(18f, 0f))
        array.add(PieEntry(9f, 0f))
        var dataSet = PieDataSet(array, "")

        dataSet.colors = ColorTemplate.COLORFUL_COLORS.toCollection(ArrayList())
        mp_pie_finished.data = PieData(dataSet)


        mp_pie_finished.setUsePercentValues(true)
        val des = Description()
        des.text = "hello"
        mp_pie_finished.description = des
        mp_pie_finished.isDrawHoleEnabled = true


//        mp_pie_finished
    }
}


