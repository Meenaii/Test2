package ut.com.pmo.test;

import org.junit.Test;
import com.pmo.test.api.MyPluginComponent;
import com.pmo.test.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}