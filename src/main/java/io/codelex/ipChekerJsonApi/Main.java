package io.codelex.ipChekerJsonApi;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


//        String urlWithoutIp = "http://ip-api.com/json/";
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter IP address to check: ");
//        String ip = scan.nextLine();
//
//        String fullURL = urlWithoutIp + ip;
//
//        JSONObject json = new JSONObject(IOUtils.toString(new URL(fullURL), StandardCharsets.UTF_8));
//        System.out.println("Origin of IP address is " + json.get("country"));

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter IP address to check: ");
        String ip = scan.nextLine();

        String ipRawData = getIpData(ip);
        JSONObject ipDataObject = new JSONObject(ipRawData);
        System.out.println("Origin of IP address is " + ipDataObject.get("country"));

    }

    public static String getIpData(String ip) throws IOException {
        String theURL = "http://ip-api.com/json/" + ip;
        URL url = new URL(theURL);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        StringBuilder inputData = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            inputData.append(inputLine);
        }

        return inputData.toString();
    }
}
