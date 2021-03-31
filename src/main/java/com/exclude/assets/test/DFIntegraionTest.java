package com.exclude.assets.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DFIntegraionTest {

    public void createAssets() {

        DataAssetCreatorImpl test = new DataAssetCreatorImpl();

        Map<String, DAFuncCreator> daFuncMap = new LinkedHashMap<String, DAFuncCreator>() {

            {
                put("ORACLE",test::oracle);
                put("ATP",test::atp);
                put("ADW",test::adw);
                put("ObjectStorage",test::objectStorage);
            }
        };


        test.createDataAssets(daFuncMap);
    }



}
