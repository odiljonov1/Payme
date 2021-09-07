package com.example.payme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.payme.Adapter.ViewPagerAdapter
import com.example.payme.Model.MyModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var list: ArrayList<MyModel>
    lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        adapter = ViewPagerAdapter(list, supportFragmentManager)

        my_tab.setupWithViewPager(view_pager)

        view_pager.adapter = adapter

        btn_next.setOnClickListener {
            view_pager.setCurrentItem(view_pager.currentItem + 1, true)
        }

        img_next.setOnClickListener {
            view_pager.setCurrentItem(view_pager.currentItem + 1, true)
        }

        btn_skip.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun loadData() {
        list = ArrayList()

        list.add(MyModel(R.drawable.image_one))
        list.add(MyModel(R.drawable.image_two))
        list.add(MyModel(R.drawable.image_three))
        list.add(MyModel(R.drawable.image_four))
    }
}
