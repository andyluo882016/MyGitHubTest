package com.example.com.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee = new Employee();

    @Test
    void getId() {
        employee.setId("TEST9900");
        assertNotNull(employee.getId());
    }

    @Test
    void setId() {
        employee.setId("TEST9900");
    }

    @Test
    void getName() {
        employee.setName("Jeff");
        assertNotNull(employee.getName());
    }

    @Test
    void setName() {
        employee.setName("Jeff");
    }

    @Test
    void testToString() {
    }
}