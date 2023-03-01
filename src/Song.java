import java.util.*;
public class Song {

    private String title;
    private String artist;

    private ArrayList<String> listOfNames= new ArrayList();

    public Song(String title, String artist){
        this.title=title;
        this.artist=artist;
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }

    public int howMany(ArrayList<String> arrayList){
        arrayList.replaceAll(String::toLowerCase);
        listOfNames.addAll(arrayList);
        int sizeOfArray = arrayList.size();
        for (int i = listOfNames.size() - arrayList.size(); i<listOfNames.size();i++){
            for (int j = 0; j < listOfNames.size() - arrayList.size();j++){
                if(listOfNames.get(i).equals(listOfNames.get(j))){
                    sizeOfArray--;
                }
            }
        }
        if(Collections.frequency(arrayList,arrayList.get(0))==arrayList.size()&&sizeOfArray == arrayList.size()){
            sizeOfArray = 1;
        }
        return sizeOfArray;
    }
}
