package com.jayfella.sdk.component.builder;

import javafx.scene.control.TitledPane;

import java.util.List;

public interface ComponentSetBuilder<T> {

    void setObject(T object);
    void setObject(T object, String... ignoredProperties);
    List<TitledPane> build();

}
