package com.github.donkeyrit.javaapp.container;

import com.github.donkeyrit.javaapp.database.DatabaseProvider;

public class ServiceContainer {

    private static ServiceContainer instance;

    public static ServiceContainer getInstance() {
        if (instance == null) {
            instance = new ServiceContainer();
        }
        return instance;
    }

    private ServiceContainer() { }

    private DatabaseProvider databaseProvider;
    public DatabaseProvider getDatabaseProvider() {
        return databaseProvider;
    }
    public void setDatabaseProvider(DatabaseProvider databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

}