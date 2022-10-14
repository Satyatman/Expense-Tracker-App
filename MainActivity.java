package com.ccps406.expensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void seeTransactions(View view){
        startActivity(new Intent(getApplicationContext(), ViewIncome.class));
        finish();

    }

    public void upcomingTransactions(View view){
        startActivity(new Intent(getApplicationContext(), ViewExpense.class));
        finish();
    }

    public void transactions(View view){
        startActivity(new Intent(getApplicationContext(),Transactions.class));
        finish();
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        finish();
    }

}