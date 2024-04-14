```java
public class Pizza() {
    
    public Pizza(int size) {
        this.size = size;
    }
    
    public Pizza(int size, boolean cheese) {
        this.size = size;
        this.cheese = cheese;
    }
    
    public Pizza(int size, boolean cheese, boolean panner) {
        this.size = size;
        this.cheese = cheese;
        this.panner = panner;
    }
}
```

This is constructor telescoping. For 10 types of optional parameters, 2^10 types of constructors would have to be created. User cannot remember the sequence of parameters as well.

More examples:

```java
```java
class Mailer {
  public void from(String addr) { System.out.println("from..."); return this;}
  public void to(String addr) { System.out.println("to..."); return this;}
  public void subject(String line) { System.out.println("subject..."); return this;}
  public void body(String content) { System.out.println("body..."); return this;}
  public void send() { System.out.println("sending..."); }
}

public class Sample {
  public static void main(String[] args) {
    new Mailer().from("rohit@example.com")
    .to("students@learnyard.com")
    .subject("Hello students")
    .body("...details...")
    .send();
  }
}

```

```java
private CloseableHttpClient getHttpClientWithAuth(String userName, String password){
    CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
    credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(userName, password));
    CloseableHttpClient httpclient = HttpClients.custom()
                                                .setConnectionManager(connManager)
                                                .setDefaultCookieStore(cookieStore)
                                                .setDefaultCredentialsProvider(credentialsProvider)
                                                .setProxy(new HttpHost("myproxy", 8080))
                                                .build();
    return httpclient;
}
```