package com.example.entrenamiento._2_PrincipiosyPatrones._4_Singleton;


class Conexion {
    String url;
    String token;
    private static Conexion conexion;
    public static Conexion getInstance(String url,String token){
        if(conexion ==null){
            conexion = new Conexion(url , token);
        }
        return conexion;
    }
    private Conexion(String url, String token) {
        this.url = url;
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public String getToken() {
        return token;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

    public class Main {
        public static void main(String[] args) {
            Conexion user1 = Conexion.getInstance("endpoint1" , "12324");
            Conexion user2 = Conexion.getInstance("endpoint2" , "123211");
            //un set en cualquiera de lso 2 users ofecta a los 2 users .por que afecta a conexion?
            //user1.setUrl("ENDPOINT X");
            System.out.println("USER 1 ENDPOINT " + user1.getUrl() + " USER 2 ENDPOINT " + user2.getUrl() );
        }
    }

