package com.uphyca.stetho_realm;

import android.content.Context;

import com.facebook.stetho.InspectorModulesProvider;

public class RealmInspectorModulesProvider extends InspectorModulesProvider {

    public static RealmInspectorModulesProvider.ProviderBuilder builder(Context context) {
        return new RealmInspectorModulesProvider.ProviderBuilder(context);
    }

    public static class ProviderBuilder {
        public ProviderBuilder(Context context) {

        }

        public RealmInspectorModulesProvider build() {
            return new RealmInspectorModulesProvider();
        }
    }

}