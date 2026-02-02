package com.scenariobased.healthcheckpro;

public class LabTestController {

    @PublicAPI(description = "Get all available lab tests")
    public void getAllLabTests() {
        // logic here
    }

    @PublicAPI(description = "Book a lab test")
    @RequiresAuth(role = "PATIENT")
    public void bookLabTest() {
        // logic here
    }

    public void internalAudit() {
        // missing annotations (should be flagged)
    }
}

