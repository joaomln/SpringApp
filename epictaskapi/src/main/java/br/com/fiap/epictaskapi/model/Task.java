package br.com.fiap.epictaskapi.model;

public record Task (
     String title,
     String description,
     int score,
     int status

) {

     public Task(String title, String description){
          this(title, description, 100, 0);
     }

}
