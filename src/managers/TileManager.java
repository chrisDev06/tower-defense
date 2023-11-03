package managers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import helperMethods.LoadSave;
import objects.Tile;

public class TileManager {

    public Tile GRASS, WATER, ROAD, GRASSTOP, GRASSBOT;
    public BufferedImage atlas;
    public ArrayList<Tile> tiles = new ArrayList<>();

    public TileManager() {
        loadAtalas();
        createTiles();
    }

    private void createTiles() {

        int id = 0;
        tiles.add(GRASS = new Tile(getSprite(8, 1), id++, "Grass"));
        tiles.add(WATER = new Tile(getSprite(0, 6), id++, "WATER"));
        tiles.add(ROAD = new Tile(getSprite(9, 0), id++, "ROAD"));
        tiles.add(GRASSTOP = new Tile(getSprite(5, 0), id++, "GRASSTOP"));
        tiles.add(GRASSBOT = new Tile(getSprite(1, 0), id++, "GRASSBOT"));

    }

    private void loadAtalas() {
        atlas = LoadSave.getSpriteAtlas();
    }

    public BufferedImage getSprite(int id) {
        return tiles.get(id).getSprite();
    }

    private BufferedImage getSprite(int xCord, int yCord) {
        return atlas.getSubimage(xCord * 32, yCord * 32, 32, 32);
    }
}
