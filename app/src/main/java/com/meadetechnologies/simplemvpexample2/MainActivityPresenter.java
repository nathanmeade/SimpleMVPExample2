package com.meadetechnologies.simplemvpexample2;

import android.view.View;

import com.meadetechnologies.simplemvpexample2.models.User;

public class MainActivityPresenter {

    private User user;
    private View view;

    public MainActivityPresenter(View view){
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String fullName){
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

    public interface View{
        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();
    }
}
