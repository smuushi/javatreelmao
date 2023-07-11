import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("papaya1");
    desertIslandPlaylist.add("papaya2");
    desertIslandPlaylist.add("papaya3");
    desertIslandPlaylist.add("papaya4");
    desertIslandPlaylist.add("papaya5");
    desertIslandPlaylist.add("papaya6");
    desertIslandPlaylist.add("papaya7");

    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.size());

    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");

    desertIslandPlaylist.remove(desertIslandPlaylist.size() - 1);
    desertIslandPlaylist.remove(desertIslandPlaylist.size() - 1);

    String songA = desertIslandPlaylist.get(0);
    String songB = desertIslandPlaylist.get(3);

    desertIslandPlaylist.set(3, songA);
    desertIslandPlaylist.set(0, songB);

    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.indexOf("papaya2"));

    String tempA = songA;

    desertIslandPlaylist.add(songA);

    System.out.println(desertIslandPlaylist);
    
    
  }
  
}