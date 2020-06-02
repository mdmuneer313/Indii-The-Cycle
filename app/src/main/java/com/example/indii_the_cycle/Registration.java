package com.example.indii_the_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.firestore.FirebaseFirestore;
import com.hbb20.CountryCodePicker;

public class Registration extends AppCompatActivity {
    FirebaseAuth fAuth;
    String phoneNumber = "+917451221244";
    String otpCode = "123456";
    String verificationId;
    EditText phone,optEnter;
    Button next;
    CountryCodePicker countryCodePicker;
    PhoneAuthCredential credential;
    Boolean verificationOnProgress = false;
    ProgressBar progressBar;
    TextView state,resend;
    PhoneAuthProvider.ForceResendingToken token;
    FirebaseFirestore fStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        phone = findViewById(R.id.phone);
        optEnter = findViewById(R.id.codeEnter);
        countryCodePicker = findViewById(R.id.ccp);
        next = findViewById(R.id.nextBtn);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        progressBar = findViewById(R.id.progressBar);
        state = findViewById(R.id.state);
        resend = findViewById(R.id.resendOtpBtn);
    }
}