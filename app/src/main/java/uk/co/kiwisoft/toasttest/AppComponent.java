package uk.co.kiwisoft.toasttest;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import uk.co.kiwisoft.toasttest.main_feature.MainActivityModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class
})
public interface AppComponent {
    void inject(MyApplication myApplication);
}
