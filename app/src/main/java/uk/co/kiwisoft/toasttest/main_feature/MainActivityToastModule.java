package uk.co.kiwisoft.toasttest.main_feature;

import dagger.Binds;
import dagger.Module;
import uk.co.kiwisoft.toasttest.ToastMachine;

/**
 * ToDo: Explain the scope of this class
 */
@Module
abstract class MainActivityToastModule {
    @Binds
    public abstract ToastMachine bindActivity(MainActivity mainActivity);
}
