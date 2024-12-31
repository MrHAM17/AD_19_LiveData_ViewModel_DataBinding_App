package com.example.livedataviewmodeldatabinding;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    // Step 1: Define MutableLiveData for Counter
    // LiveData is used to store and observe data changes
    private MutableLiveData<Integer> counter = new MutableLiveData<>();

    // Step 2: Method to Increase Counter
    // Increases the value of the counter when invoked (e.g., on button click)
    public void increaseCounter(View view) {
        // Retrieve the current value from LiveData
        int currentValue = counter.getValue() != null ? counter.getValue() : 0;

        // Increment the value by 1
        counter.setValue(currentValue + 1);
    }

    // Step 3: Getter for Counter
    // Exposes the counter as LiveData to allow observation in the Activity
    public LiveData<Integer> getCounter() {
        return counter;
    }
}
