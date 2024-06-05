package org.example;

import com.sun.tools.javac.util.Log;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends PlaywrightFactory{

    @Test
    void loginTest() {
    assertEquals(page.url(), BaseVariables.INVENTORY_URL);

    }
}