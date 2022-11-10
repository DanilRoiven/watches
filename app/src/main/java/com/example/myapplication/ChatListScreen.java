package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityChatListScreenBinding;

public class ChatListScreen extends Activity {

    private TextView mTextView;
    private ActivityChatListScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityChatListScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}