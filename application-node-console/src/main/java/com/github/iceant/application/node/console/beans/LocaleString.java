package com.github.iceant.application.node.console.beans;

import java.util.HashMap;
import java.util.Locale;

public class LocaleString extends HashMap<Locale, String> {

    public LocaleString set(Locale locale, String value){
        put(locale, value);
        return this;
    }

    public LocaleString set(String value){
        put(Locale.getDefault(), value);
        return this;
    }

    public String get(){
        return get(Locale.getDefault());
    }

}
