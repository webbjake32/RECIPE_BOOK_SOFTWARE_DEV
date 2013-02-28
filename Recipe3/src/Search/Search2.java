import java.net.*;
import java.io.*;

public class Search2
{
        public static void main ( String[] args ) throws IOException {
                try {
                        URL url = new URL("http://www.google.com/search?q=example");
                        URLConnection conn =  url.openConnection();
                        conn.setRequestProperty("User-Agent",
                                        "Mozilla/5.0 (X11; U; Linux x86_64; en-GB; rv:1.8.1.6) Gecko/20070723 Iceweasel/2.0.0.6 (Debian-2.0.0.6-0etch1)");
                        BufferedReader in = new BufferedReader(
                                new InputStreamReader(conn.getInputStream())
                        );
                        String str;

                        while ((str = in.readLine()) != null) {
                                System.out.println(str);
                        }

                        in.close();
                }
                catch (MalformedURLException e) {}
                catch (IOException e) {}
        }
}