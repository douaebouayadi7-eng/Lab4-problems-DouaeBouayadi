package instructor;

import java.util.Locale;

public class Subject {
    private int id;
    private String code;
    private String title;
    public String getTitle(){
        return title;
    }
    public String getCode(){
        return code;
    }
    public int getId(){
        return id;
    }
    public String normalizedCode(){
        return getCode().trim().toUpperCase();
    }
    public String properTitle(){
        String result="";
        for (String w: getTitle().split((" "))){
            result+= w.substring(0,1).toUpperCase()+w.substring(1)+" ";
        }
        return result.trim();
    }
    public boolean isIntroCourse(){
        return getTitle().toLowerCase().contains("intro")||normalizedCode().startsWith("INTRO-");
    }
    public String syllabusLine(Instructor i){
        StringBuilder sb= new StringBuilder();
        sb.append(normalizedCode());
        sb.append(" - ");
        sb.append(properTitle());
        return sb.toString();
    }


}
