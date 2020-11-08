package lesson_6;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class URLHolder {
    private String protocol;
    private String servAdress;
    private String port = "0000";
    private String postAdress;
    private LinkedHashMap<String, String> params;
    private String subParams;


    public URLHolder() {
    }


    public URLHolder(String h) throws UnsupportedEncodingException {
        URLHolder newOne = URLHolder.URLUpperIncoder(h);
        this.protocol = newOne.protocol;
        this.servAdress = newOne.servAdress;
        this.port = newOne.port;
        this.postAdress = newOne.postAdress;
        this.params = newOne.params;
        this.subParams = newOne.subParams;
   }



   private static URLHolder URLUpperIncoder(String h) throws UnsupportedEncodingException {
       URLHolder newOne = new URLHolder();
       String[] temp = h.split("/");
       temp = Arrays.copyOfRange(temp, 0, temp.length-1);
       newOne.servAdress = temp[2].split(":")[0];
       newOne.port = temp[2].split(":")[1];
       String decoded = URLDecoder.decode(h, "ASCII");
       newOne.protocol = decoded.split("//")[0];
       newOne.postAdress = decoded.split("/")[3].split("\\?")[0];
       String params = decoded.split("/")[3].split("\\?")[1].split("&return")[0];
       newOne.subParams = decoded.split("&return=")[1].split("&")[0];
       newOne.params = ParamstoHashMap(params);
       return newOne;
   }
   //private static



    public String getServAdress() {
        return servAdress;
    }

    private static LinkedHashMap <String, String> ParamstoHashMap(String h){
        LinkedHashMap <String, String> temp_hashMap = new LinkedHashMap <String, String>();
       String[] temp = h.split("&");
        for (int i = 0; i < temp.length; i++) {
            temp_hashMap.put(temp[i].split("=")[0], temp[i].split("=")[1]);
        }
        return temp_hashMap;
   }


    public String getPort() {
        return port;
    }

    public String getPostAdress() {
        return postAdress;
    }

    @Override
    public String toString() {
        return "URLHolder:\n" +
                "protocol= " + protocol + "\n" +
                "servAdress= " + servAdress + "\n" +
                "port= " + port + "\n"  +
                "postAdress= " + postAdress  + "\n" +
                "params=" + params + "\n"
                + "subparams= &return=" + subParams;

    }

    public String toUrl() throws UnsupportedEncodingException {
        return  protocol +
                "//" + servAdress +
                ":" + port + "/" +
                postAdress + "?" + URLHolder.mapToString(params) + "return=" + URLEncoder.encode(subParams, "UTF-8")
                + "&" + "object=" + params.get("object");

    }


    public static String mapToString(LinkedHashMap<String, String> a){
        String temp = "";
        for (Map.Entry<String, String> entry: a.entrySet()
        ) {
            temp += entry.getKey() + "=" + entry.getValue() + "&";

        }
        return temp;
    }
}
