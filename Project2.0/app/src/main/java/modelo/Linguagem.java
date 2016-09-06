package modelo;

import java.util.ArrayList;

/**
 * Created by atecdroid on 7/29/16.
 */
public class Linguagem {
    protected String Name;
    protected String Description;
    protected String Version;
    protected ArrayList<Tutorial> tutorials = new ArrayList<Tutorial>();

    //Constructors
    public Linguagem(){}
    public Linguagem(String n, String d, String v){
        this.Name = n;
        this.Description = d;
        this.Version = v;
    }

    //Getters
    public String getName() {
        return Name;
    }
    public String getDescription() {
        return Description;
    }
    public String getVersion() {
        return Version;
    }
    public ArrayList<Tutorial> getTutorials() {
        return tutorials;
    }

    //Setters
    public void setName(String name) {
        Name = name;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public void setVersion(String version) {
        Version = version;
    }
    public void setTutorials(ArrayList<Tutorial> tutorials) {
        this.tutorials = tutorials;
    }

    //others
    public void addElement(Tutorial tut)
    {
        tutorials.add(tut);
    }
    public void rmvElement(Tutorial tut)
    {
        if(!tutorials.isEmpty())
        {
            int i = tutorials.indexOf(tut); //returns -1 if object not found
            if(i != -1)
                tutorials.remove(i);
        }
    }


}
