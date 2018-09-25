package com.listeningparty.listeningparty.ui;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.listeningparty.listeningparty.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class AuthenticationFragment extends Fragment {


    @BindView(R.id.fragment_signin_title)
    TextView signInTitle;

    @BindView(R.id.fragment_signup_fullname)
    EditText fullname;

    @BindView(R.id.fragment_signup_title)
    TextView signUpTitle;

    @BindView(R.id.fragment_signin_form_container)
    View signInContainer;

    @BindView(R.id.fragment_signup_form_container)
    View signUpContainer;

    public AuthenticationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_authentication, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    public static AuthenticationFragment newInstance() {
        return new AuthenticationFragment();
    }


    @OnClick({R.id.fragment_signup_title, R.id.fragment_signin_title})
    public void toggleSignInUp(TextView textView) {
        if (textView.getText().equals("SIGN IN")) {
//            signInTitle.setTextColor(getResources().getColor(R.color.colorAccent));
//            signUpTitle.setTextColor(getResources().getColor(R.color.darker_gray));
//
//            signUpContainer.setVisibility(View.GONE);
//            signInContainer.setVisibility(View.VISIBLE);

            fullname.setVisibility(View.GONE);
        } else if (textView.getText().equals("SIGN UP")) {
//            signUpTitle.setTextColor(getResources().getColor(R.color.colorAccent));
//            signInTitle.setTextColor(getResources().getColor(R.color.darker_gray));
//
//            signInContainer.setVisibility(View.GONE);
//            signUpContainer.setVisibility(View.VISIBLE);

            fullname.setVisibility(View.VISIBLE);

        }
    }

}
