package com.github.donkeyrit.javaapp.container;

import com.github.donkeyrit.javaapp.database.DatabaseProvider;
import com.github.donkeyrit.javaapp.model.User;
import com.github.donkeyrit.javaapp.ui.UiManager;

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

    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    private UiManager uiManager;
    public UiManager getUiManager() {
        return uiManager;
    }
    public void setUiManager(UiManager uiManager) {
        this.uiManager = uiManager;
    }
}
