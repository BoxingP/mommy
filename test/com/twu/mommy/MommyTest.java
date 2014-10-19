package com.twu.mommy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MommyTest {
    private Mommy mommy;

    @Before
    public void initObject() {
        mommy = new Mommy();
    }
    @Test
    public void shouldReturnEmptyWhenInputIsEmpty() {
        assertThat(mommy.mommyfy(""), is(""));
    }

    @Test
    public void shouldReturnStrWhenInputIsStr() {
        assertThat(mommy.mommyfy("str"), is("str"));
    }

    @Test
    public void shouldReturnMommyWhenInputIsA() {
        assertThat(mommy.mommyfy("a"), is("mommy"));
    }

    @Test
    public void shouldReturnMommyWhenInputIsAa() {
        assertThat(mommy.mommyfy("aa"), is("mommy"));
    }

    @Test
    public void shouldReturnCmommyrWhenInputIsCar() {
        assertThat(mommy.mommyfy("car"), is("cmommyr"));
    }

    @Test
    public void shouldReturnHmommysmommyWhenInputIsHouse() {
        assertThat(mommy.mommyfy("house"), is("hmommysmommy"));
    }
}
