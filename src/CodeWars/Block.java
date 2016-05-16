package CodeWars;

/**
 * Created by wangweimin on 16/2/24.
 */
public class Block {
    // Good Luck!
    private int[] edges;

    public Block(int[] numbers) {
        edges = numbers;
    }

    public int getWidth() {
        return edges[0];
    }

    public int getLength() {
        return edges[1];
    }

    public int getHeight() {
        return edges[2];
    }

    public int getVolume() {
        return edges[0] * edges[1] * edges[2];
    }

    public int getSurfaceArea() {
        return 2 * edges[0] * edges[1] + 2 * edges[0] * edges[2] + 2 * edges[1] * edges[2];
    }
}
