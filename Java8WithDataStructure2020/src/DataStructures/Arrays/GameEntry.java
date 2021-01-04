package DataStructures.Arrays;

public class GameEntry {

    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", score=" + score;
    }
}

class ScoreBoard{
    private int numEntries = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity){
        board = new GameEntry[capacity];
    }

    public void add(GameEntry gE){
        int newScore = gE.getScore();
        if(numEntries < board.length || board[numEntries-1].getScore() < newScore){
            if(numEntries < board.length)
                numEntries++;
            int j = numEntries-1;
            while(j > 0 && newScore > board[j-1].getScore()){
                board[j] = board[j-1];
                j--;
            }
            board[j] = gE;
        }
    }

    public GameEntry remove(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= numEntries){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        GameEntry temp = board[index];
        for(int i = index; i < numEntries-1; i++){
            board[i] = board[i+1];
        }
        board[numEntries-1] = null;
        numEntries--;
        return temp;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < numEntries; i++){
            if(i > 0)
                sb.append(", ");
            sb.append(board[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        ScoreBoard highScores = new ScoreBoard(5);
        String[] name = {"Aakash", "Ajay", "Shiva", "Shrey", "Micky", "Akhil"};
        int[] score = {800, 466, 600, 345, 700, 400};

        for(int i = 0; i < name.length; i++){
            GameEntry gE = new GameEntry(name[i], score[i]);
            System.out.println("Adding " + gE);
            highScores.add(gE);
            System.out.println("Scoreboard: " + highScores);
        }

        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(highScores);
        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(highScores);
        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(highScores);
        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(highScores);
        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(highScores);
        System.out.println("Removing score at index " + 0);
        highScores.remove(0);
        System.out.println(highScores);
    }
}
