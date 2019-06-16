package com.example.examen_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.examen_2.model.Estudiante;

public class EstudianteFragment extends Fragment {

    private Estudiante mEstudiante;
    private EditText editTextNombre;
    private EditText editTextEdad;
    private EditText editTextEmail;
    private Button mDateButton;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEstudiante = new Estudiante();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_formulario_alumno, container, false);

        mDateButton = (Button) v.findViewById(R.id.crime_date);
        mDateButton.setText(mEstudiante.getmDate().toString());
        mDateButton.setEnabled(false);

        editTextNombre = v.findViewById(R.id.editTextNombre);
        editTextEdad = v.findViewById(R.id.editTextEdad);
        editTextEmail = v.findViewById(R.id.editTextEmail);


        editTextNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
// This space intentionally left blank
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mEstudiante.setNombre(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s) {
// This one too
            }
        });

        editTextEdad.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mEstudiante.setEdad(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextEmail.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mEstudiante.setEmail(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

            return v;
    }


}
