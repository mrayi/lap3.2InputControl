package com.example.taruc.lap32inputcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinnerAge;
    private RadioGroup radioGroupGener;
    private RadioButton radioButtonMale, radioButtonFemale;
    private CheckBox checkBoxSmoker;
    private TextView textViewPremium;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //linking UI to program
        spinnerAge=(Spinner)findViewById(R.id.spinnerAge);
        radioGroupGener=(RadioGroup)findViewById(R.id.radioGroupGender);
        radioButtonMale=(RadioButton)findViewById(R.id.radioButtonMale);
        radioButtonFemale=(RadioButton)findViewById(R.id.radioButtonFemale);
        checkBoxSmoker=(CheckBox)findViewById(R.id.checkBoxSmoker);
        textViewPremium=(TextView)findViewById(R.id.textViewPremium);

        //create an adapter for spinner
        ArrayAdapter<CharSequence> adapter=
                ArrayAdapter.createFromResource(
                        this,
                        R.array.age_group,
                        android.R.layout.simple_spinner_item
                );
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item

        );
        spinnerAge.setOnItemSelectedListener(this);
        spinnerAge.setAdapter(adapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),
                "Position:" + position,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void calculatePremium(View view){
        double premium = 0;
        int pos;
        pos = spinnerAge.getSelectedItemPosition();
        //TODO: determine the baisc premium


        int indexGender;
        indexGender = radioGroupGener.getCheckedRadioButtonId();
        if(indexGender == R.id.radioButtonMale) {
            //TODO: calculate premium of male

        }else{
            //TODO: calculate premium of female
        }

        if(checkBoxSmoker.isChecked()){
            //TODO: calculate premium of smoker
        }

        textViewPremium.setText(
                getString(R.string.premium) + " : " + premium
        );

    }

    public void resetPremium(View view){
        //TODO: clear UI and reset premium value
    }

}
