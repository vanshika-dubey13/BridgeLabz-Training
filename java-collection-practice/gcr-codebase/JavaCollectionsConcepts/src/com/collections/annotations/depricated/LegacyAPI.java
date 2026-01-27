package com.collections.annotations.depricated;

class LegacyAPI {

	//depricated method
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature (deprecated)");
    }

    public void newFeature() {
        System.out.println("This is the new and improved feature");
    }
}