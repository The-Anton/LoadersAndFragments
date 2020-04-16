package com.solvabit.loadersandfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.solvabit.loadersandfragments.fragments.LoaderFragment
import com.solvabit.loadersandfragments.fragments.LoaderFragment2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    lateinit var importLoader: LoaderFragment
    lateinit var importLoader2: LoaderFragment2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        importLoader = LoaderFragment.newInstance()
        button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, importLoader )
                .addToBackStack(importLoader.toString())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }
    }
}
