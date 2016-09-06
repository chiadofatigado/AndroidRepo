package modelo;

/**
 * Created by atecdroid on 7/29/16.
 */
public class Tutorial {
    String Link;
    String Name;
    String Author;

    //Constructors
    public Tutorial(){}
    public Tutorial(String l, String n, String a){
        this.Link = l;
        this.Name = n;
        this.Author = a;
    }

    //Getters
    public String getLink() {
        return Link;
    }
    public String getName() {
        return Name;
    }
    public String getAuthor() {
        return Author;
    }

    //Setters
    public void setLink(String link) {
        Link = link;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setAuthor(String author) {
        Author = author;
    }
}
