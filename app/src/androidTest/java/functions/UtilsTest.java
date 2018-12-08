package functions;

import junit.framework.TestCase;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;

public class UtilsTest extends TestCase {

    public void testGetReadableDurationFromMillis() {
        assertEquals("2 hours 16 minutes 32 seconds ", Utils.getReadableDurationFromMillis(8192000L));
        assertEquals("", Utils.getReadableDurationFromMillis(100L));
        assertEquals("11 days 9 hours 10 minutes 50 seconds ", Utils.getReadableDurationFromMillis(983450000L));
    }

    public void testGetShortReadableDurationFromMillis() {
        assertEquals("3 hrs", Utils.getShortReadableDurationFromMillis(8192000L));
        assertEquals("0 secs", Utils.getShortReadableDurationFromMillis(100L));
        assertEquals("11 days", Utils.getShortReadableDurationFromMillis(983450000L));

    }

    public void testGetLocalDateStringFromUTCString() {
        Date date = new Date();
        assertEquals("1970-01-01T00:00:00+0000", Utils.GetLocalDateStringFromUTCString(date.toString()));
        assertEquals("1970-01-01T00:00:00+0000", Utils.GetLocalDateStringFromUTCString(LocalDateTime.now().toString()));
    }
}