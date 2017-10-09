package uk.co.kiwisoft.toasttest.main_feature;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent()
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
