package com.example.examen_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.examen_2.model.Estudiante;
import com.example.examen_2.model.EstudianteLab;

import java.util.List;

public class EstudianteListFragment extends Fragment {

    private RecyclerView EstudianteRecyclerView;
    private EstudianteAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_estudiante_list, container, false);
        EstudianteRecyclerView = (RecyclerView) view
                .findViewById(R.id.crime_recycler_view);
        EstudianteRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private void updateUI() {
        EstudianteLab crimeLab = EstudianteLab.get(getActivity());
        List<Estudiante> crimes = crimeLab.getCrimes();
        mAdapter = new EstudianteAdapter(crimes);
         EstudianteRecyclerView.setAdapter(mAdapter);
    }

    private class EstHolder extends RecyclerView.ViewHolder {
        public EstHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_estudiante , parent, false));
        }
    }

    private class EstudianteAdapter extends RecyclerView.Adapter<EstHolder> {
        private List<Estudiante> mCrimes;
        public EstudianteAdapter(List<Estudiante> crimes) {
            mCrimes = crimes;
        }

        @NonNull
        @Override
        public EstHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new EstHolder(layoutInflater, viewGroup);
        }

        @Override
        public void onBindViewHolder(@NonNull EstHolder crimeHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return mCrimes.size();
        }
    }

}
