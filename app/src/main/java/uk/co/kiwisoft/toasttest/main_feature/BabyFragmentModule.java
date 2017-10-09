package uk.co.kiwisoft.toasttest.main_feature;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * ToDo: Explain the scope of this class
 */

@Module(subcomponents = BabyFragmentSubcomponent.class)
public abstract class BabyFragmentModule {
    @ContributesAndroidInjector
    abstract BabyFragment contributeBabyFragment();
}
