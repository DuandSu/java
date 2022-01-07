public class Main {
    public static void main(String[] args) {
        
        String[] roomDesc = {
            "You are in the entry hall. There is a closet, chair, coat rack and a picture of an old man. It is a long narrow room. "
                + "There are doors to the North, West and East."
        };
        int room = 1;
        boolean keepGoing = true;
        
        while (keepGoing) {
            System.out.println(roomDesc[room-1]);
        }
    }
}
