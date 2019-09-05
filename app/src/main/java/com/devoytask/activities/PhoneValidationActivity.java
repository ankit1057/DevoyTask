package com.devoytask.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.devoytask.R;

public class PhoneValidationActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etPhone;
    private Button btnVerify;
    String phone,password;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2019-09-05 20:40:10 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        etPhone = (EditText)findViewById( R.id.etPhone );
        btnVerify = (Button)findViewById( R.id.btnVerify );

        btnVerify.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2019-09-05 20:40:10 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == btnVerify ) {
            if (!TextUtils.isEmpty(String.valueOf(etPhone.getText()))){
                phone=String.valueOf(etPhone.getText());
            }
            else {
                Toast.makeText(PhoneValidationActivity.this, "Phone Can't be empty.....", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_validation);
        findViews();
    }
}
