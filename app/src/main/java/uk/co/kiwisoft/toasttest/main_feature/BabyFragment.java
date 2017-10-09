package uk.co.kiwisoft.toasttest.main_feature;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.AndroidSupportInjection;
import uk.co.kiwisoft.toasttest.R;
import uk.co.kiwisoft.toasttest.ToastMachine;


public class BabyFragment extends Fragment {

    @Inject
    ToastMachine toastMachine;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_button, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @OnClick(R.id.toast_button)
    void onToastClicked() {
        toastMachine.showToast("Ye boi.");
    }
}
