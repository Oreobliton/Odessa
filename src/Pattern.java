package src;


import java.util.HashMap;
import java.util.Random;

public enum Pattern {
    ISOLOIR, CARRE, FUMOIR, T;
    static HashMap<Pattern, int[][]> map = new HashMap<>();
    public static void genPattern(){
        int[][] isoloir = {{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        map.put(ISOLOIR, isoloir);
        int[][] carre = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        map.put(CARRE, carre);
        int[][] fumoir = {{1,1,1,1,0},{1,1,1,1,0},{1,1,1,1,0},{0,0,0,1,0},{0,0,0,0,0}};
        map.put(FUMOIR, fumoir);
        int[][] t = {{1,1,1,1,1},{0,1,1,1,0},{0,1,1,1,0},{0,0,1,0,0},{0,0,1,0,0}};
        map.put(T, t);
    }

    public static Pattern getRandomPattern() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

