package com.example.bank.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.bank.model.User;
import com.example.bank.model.UserRepository;


public class MainActivityViewModel extends AndroidViewModel {

    UserRepository userRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        userRepository = new UserRepository(application);
    }

    public LiveData<User[]> getAllUserData(){
        return userRepository.getUserData();
    }
}

