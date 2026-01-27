package com.collections.annotations.depricated;

public class DeprecatedDemo {

	//main method
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();
        // Compiler warning
        api.oldFeature();
        api.newFeature();
    }
}

