package com.example.examen_2;

import android.support.v4.app.Fragment;

public class EstudianteListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new EstudianteListFragment();
    }

}
