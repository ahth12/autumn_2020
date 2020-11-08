package lesson_6;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Solution6 {
    public static void run(String[] args) throws UnsupportedEncodingException {
        String urt = "http://localhost.netcracker.com:6810/product.plain_taskc.nc?tab=_Task&object=9090363151013783084&container=9158610804913819337&task=9158610813113819418&state=update&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084";
        String url = "http://localhost.netcracker.com:6810/product.plain_taskc.nc?tab=_Task&object=9090363151013783084&container=9158610804913819337&task=9158610813113819418&state=update&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084";
        String decoded = URLDecoder.decode(url, "ASCII");
        System.out.println(decoded);
        URLHolder h = new URLHolder(url);
        System.out.println(h);
        System.out.println("Собранная заново ссылка:" + "\n" + h.toUrl());
    }
}
