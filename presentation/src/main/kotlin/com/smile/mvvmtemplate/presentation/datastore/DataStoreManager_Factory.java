// Generated by Dagger (https://dagger.dev).
package com.smile.mvvmtemplate.presentation.datastore;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataStoreManager_Factory implements Factory<DataStoreManager> {
  private final Provider<Context> appContextProvider;

  public DataStoreManager_Factory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public DataStoreManager get() {
    return newInstance(appContextProvider.get());
  }

  public static DataStoreManager_Factory create(Provider<Context> appContextProvider) {
    return new DataStoreManager_Factory(appContextProvider);
  }

  public static DataStoreManager newInstance(Context appContext) {
    return new DataStoreManager(appContext);
  }
}
