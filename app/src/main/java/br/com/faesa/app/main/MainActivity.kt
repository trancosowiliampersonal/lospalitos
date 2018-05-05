package br.com.faesa.app.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.faesa.app.R
import br.com.faesa.app.listcareer.CareerFragment
import br.com.faesa.app.listprogress.ProgressFragment
import br.com.faesa.app.listproject.ProjectFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    override val presenter: MainContract.Presenter = MainPresenter(this)
    val adapter by lazy { createAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBar()
        setupAdapter()
    }

    private fun setupActionBar() {
        setSupportActionBar(mainToolbar)
        supportActionBar?.title = resources.getString(R.string.app_name)
    }

    private fun setupAdapter() {
        mainViewPager.adapter = adapter
        mainTabs.setupWithViewPager(mainViewPager)
    }

    private fun createAdapter(): MainViewPageAdapter {
        val adapter = MainViewPageAdapter(supportFragmentManager)
        adapter.add(CareerFragment.newInstance())
        adapter.add(ProjectFragment.newInstance())
        adapter.add(ProgressFragment.newInstance())
        return adapter
    }
}
