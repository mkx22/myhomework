package net.frju.flym;

import android.view.View;

import android.graphics.Color;
import android.view.ViewGroup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.fred.feedex.R;
import net.frju.flym.ui.main.MainActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class qd_ActivityTest {
    private qd_Activity example;

    @Before
    public void setUp() throws Exception {
        example = new qd_Activity();
    }
    @Test
    public void login() throws Exception {
        int c = example.counter;
        assertEquals(3, c);
    }
    @Test
    public void login1() throws Exception {
        int c = example.counter;
        assertEquals(1, c);
    }
    @Test
    public void login2() throws Exception {
        TextView c = example.attempts;
        assertEquals(Color.RED, c);
    }
    @Test
    public void login3() throws Exception {
        int c = example.counter;
        assertEquals(2, c);
    }
    @Test
    public void login4() throws Exception {
        int c = example.counter;
        assertEquals(4, c);
    }

}