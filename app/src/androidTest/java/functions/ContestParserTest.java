package functions;


import junit.framework.TestCase;

import org.mockito.Mockito;

import nsit.app.com.nsitapp.sync.StringDownloader;

public class ContestParserTest extends TestCase {

    public void testEmptyRssStringParse() {
        ContestParser contestParser = new ContestParser();
        assertEquals(0, contestParser.parse("").size());
    }

    public void testNonEmptyRssStringParse() {
        ContestParser contestParser = new ContestParser();
        String mocked = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<rss version=\"2.0\">\n" +
                "  <channel>\n" +
                "    <title>Events</title>\n" +
                "    <description>Events</description>\n" +
                "    <link>https://www.hackerrank.com</link>\n" +
                "    <item>\n" +
                "      <title>Topcoder - Data Science Match: Mercury Challenge Period 3</title>\n" +
                "      <description>Data Science Match: Mercury Challenge Period 3</description>\n" +
                "      <url>http://topcoder.com/mercury-challenge/</url>\n" +
                "      <startTime>2019-02-01 00:00:00 UTC</startTime>\n" +
                "      <endTime>2019-05-01 00:00:00 UTC</endTime>\n" +
                "    </item>\n" +
                "  </channel>\n" +
                "</rss>";
        assertEquals(1, contestParser.parse(mocked).size());
    }
}