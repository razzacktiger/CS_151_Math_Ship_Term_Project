package application;

public class User {
    String username;
    int score; 

    public User(String username, int score){
        this.username = username;
        this.score = score;
    }

    public String getUsername(){
        return username;
    }

    public int getScore(){
        return score;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setScore(int score){
        this.score = score;
    }

}
