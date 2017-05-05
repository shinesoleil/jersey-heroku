package com.example.myproject;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(HelloResource.class);
    }

    @Test
    public void should_return_hello_in_english() {
        String res = target("/hello/en").request().get(String.class);
        assertThat(res, is("hello"));
    }

    @Test
    public void should_return_hello_in_french() {
        String res = target("/hello/fr").request().get(String.class);
        assertThat(res, is("bonjour"));
    }

    @Test
    public void should_return_hello_in_qqq() {
        String res = target("/hello/fr").request().get(String.class);
        assertThat(res, is("bonjour"));
    }
}
