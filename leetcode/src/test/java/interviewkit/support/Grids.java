package interviewkit.support;

/** Helpers for writing compact test inputs. */
public final class Grids {
    private Grids() {}

    /** chars("110", "011") -> {{'1','1','0'},{'0','1','1'}} */
    public static char[][] chars(String... rows) {
        char[][] grid = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) grid[i] = rows[i].toCharArray();
        return grid;
    }
}
