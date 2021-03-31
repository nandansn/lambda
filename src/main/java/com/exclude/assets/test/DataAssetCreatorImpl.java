package com.exclude.assets.test;

import java.util.HashMap;
import java.util.Map;

public class DataAssetCreatorImpl {

    static {
        System.out.println("nanda");
    }

    public DataAssetCreatorImpl() {
       System.out.println("cons");
    }





    public void createDataAssets(Map<String, DAFuncCreator> daFuncMap) {

        daFuncMap.entrySet().stream().forEach(e -> {
            e.getValue().func();
        });

    }

    protected  void oracle() {

        System.out.println("Oracle");

    }

    protected  void objectStorage() {
        System.out.println("Object Storage");
    }

    protected  void atp() {
        System.out.println("ATP");
    }

    protected void adw() {
        System.out.println("ADW");
    }
}
