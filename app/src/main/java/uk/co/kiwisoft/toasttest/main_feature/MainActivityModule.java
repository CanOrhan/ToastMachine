package uk.co.kiwisoft.toasttest.main_feature;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import uk.co.kiwisoft.toasttest.ToastMachine;

@Module(subcomponents = MainActivitySubcomponent.class)
public abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = {
            BabyFragmentModule.class,
            MainActivityToastModule.class
    })
    abstract MainActivity contributeYourActivityInjector();
}
