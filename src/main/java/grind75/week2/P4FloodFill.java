package main.java.grind75.week2;

/*
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the
pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of
the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color),
and so on. Replace the color of all the aforementioned pixels with color.

Return the modified image after performing the flood fill.
 */
public class P4FloodFill {
    public static void main(String[] args) {
        floodFill(new int[][]{
                        {1, 1, 1},
                        {1, 1, 0},
                        {1, 0, 1}},
                1, 1, 2);
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private static void fill(int[][] image, int sr, int sc, int targetColor, int colorToReplace) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return;

        if (image[sr][sc] == colorToReplace) {
            image[sr][sc] = targetColor;

            fill(image, sr + 1, sc, targetColor, colorToReplace);
            fill(image, sr - 1, sc, targetColor, colorToReplace);
            fill(image, sr, sc + 1, targetColor, colorToReplace);
            fill(image, sr, sc - 1, targetColor, colorToReplace);
        }
    }
}
