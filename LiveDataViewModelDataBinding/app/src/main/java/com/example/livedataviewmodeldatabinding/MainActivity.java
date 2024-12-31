package com.example.livedataviewmodeldatabinding;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.livedataviewmodeldatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Declaration of ViewModel and DataBinding variables
    MyViewModel viewModel;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // Step 1: Set up Data Binding
        // Establishes a connection between the layout file and the Activity
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Step 2: Initialize ViewModel
        // Retrieves an instance of MyViewModel using ViewModelProvider
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        // Step 3: Bind ViewModel to the layout
        // Enables the layout to interact with the ViewModel directly
        mainBinding.setMyviewmodel(viewModel);

        // Step 4: Observe LiveData
        // Monitors the counter LiveData from ViewModel for changes
        viewModel.getCounter().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer counter) {
                // Updates the UI dynamically when LiveData changes
                mainBinding.textView2.setText("" + counter);
            }
        });
    }
}