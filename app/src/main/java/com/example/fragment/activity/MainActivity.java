package com.example.fragment.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragment.R;
import com.example.fragment.fragment.ContactFragment;
import com.example.fragment.fragment.CoversationFragment;

public class MainActivity extends AppCompatActivity {

    private Button contactsButton, conversationsButton;
    private ContactFragment mContactFragment;
    private CoversationFragment mCoversationFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        contactsButton = findViewById(R.id.buttonContacts);
        conversationsButton = findViewById(R.id.buttonConversations);

        mCoversationFragment = new CoversationFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContainer, mCoversationFragment);
        transaction.commit();

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContactFragment = new ContactFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContainer, mContactFragment);
                transaction.commit();
            }
        });

        conversationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCoversationFragment = new CoversationFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContainer, mCoversationFragment);
                transaction.commit();
            }
        });
    }
}