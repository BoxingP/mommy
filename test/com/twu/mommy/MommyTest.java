package com.twu.mommy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by bxpeng on 10/15/14.
 */
public class MommyTest {
    @Test
    public void shouldReturnEmptyWhenInputIsEmpty() {
        Mommy mommy = new Mommy();
        assertThat(mommy.mommyfy(""), is(""));
    }

    @Test
    public void shouldReturnStrWhenInputIsStr() {
        Mommy mommy = new Mommy();
        assertThat(mommy.mommyfy("str"), is("str"));
    }

    @Test
    public void shouldReturnMommyWhenInputIsA() {
        Mommy mommy = new Mommy();
        assertThat(mommy.mommyfy("a"), is("mommy"));
    }

    @Test
    public void shouldReturnMommyWhenInputIsAa() {
        Mommy mommy = new Mommy();
        assertThat(mommy.mommyfy("aa"), is("mommy"));
    }
}
