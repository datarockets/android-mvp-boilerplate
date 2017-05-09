package com.chyrta.boilerplate.ui.main

import android.os.Bundle
import com.chyrta.boilerplate.R
import com.chyrta.boilerplate.ui.base.BaseActivity

class MainActivity : BaseActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayout(): Int = R.layout.activity_main

    override fun showList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
