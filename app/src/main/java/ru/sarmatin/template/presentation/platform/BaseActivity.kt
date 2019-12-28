package ru.sarmatin.template.presentation.platform

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import ru.sarmatin.template.presentation.ui.main.GlobalState

abstract class BaseActivity : AppCompatActivity(){

    private lateinit var globalState: GlobalState

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        globalState = ViewModelProviders.of(this).get(GlobalState::class.java)
    }



}