package com.ocp.day23_io;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientDemo {

    public static void main(String[] args) throws Exception {
        String url = "https://www.w3.org/TR/PNG/iso_8859-1.txt";
        
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(30))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("回應碼: " + response.statusCode());
            System.out.println("內容: " + response.body().toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
