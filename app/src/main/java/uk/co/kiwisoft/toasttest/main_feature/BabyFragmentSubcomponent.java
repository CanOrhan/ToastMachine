package uk.co.kiwisoft.toasttest.main_feature;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * ToDo: Explain the scope of this class
 */
@Subcomponent
public interface BabyFragmentSubcomponent extends AndroidInjector<BabyFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BabyFragment> {}
}
