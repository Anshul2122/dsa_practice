import java.util.*;

public class cubeLayout {
    // Method to count the total number of common sides
    public static int countCommonSides(int n, List<String[]> instructions) {
        // HashMap to store cube positions with cube number as key and coordinates as value
        HashMap<Integer, int[]> positions = new HashMap<>();

        // Directions map to adjust coordinates based on the instruction
        Map<String, int[]> directions = Map.of(
                "right", new int[]{1, 0},
                "left", new int[]{-1, 0},
                "top", new int[]{0, 1},
                "down", new int[]{0, -1}
        );

        // Place the first cube at (0, 0)
        int firstCube = Integer.parseInt(instructions.get(0)[0]);
        positions.put(firstCube, new int[]{0, 0});

        // Process each instruction to place cubes
        for (String[] instruction : instructions) {
            int cube1 = Integer.parseInt(instruction[0]);
            int cube2 = Integer.parseInt(instruction[1]);
            String direction = instruction[2];

            // Check if cube1 has been placed
            if (!positions.containsKey(cube1)) {
                System.out.println("Error: Cube " + cube1 + " not placed yet.");
                continue;
            }

            // Get current position of cube1
            int[] currentPos = positions.get(cube1);
            int dx = directions.get(direction)[0];
            int dy = directions.get(direction)[1];

            // Calculate the new position for cube2
            int[] newPosition = new int[]{currentPos[0] + dx, currentPos[1] + dy};
            positions.put(cube2, newPosition);
        }

        // Count common sides
        return calculateCommonSides(positions);
    }

    // Helper method to count common sides
    private static int calculateCommonSides(HashMap<Integer, int[]> positions) {
        int totalCommonSides = 0;

        // For each cube, check if it has neighbors in adjacent positions
        for (int[] coord : positions.values()) {
            // List of possible neighbors' coordinates
            int[][] neighbors = {
                    {coord[0] + 1, coord[1]},   // right
                    {coord[0] - 1, coord[1]},   // left
                    {coord[0], coord[1] + 1},   // top
                    {coord[0], coord[1] - 1}    // down
            };

            // Check each neighbor
            for (int[] neighbor : neighbors) {
                // Check if the neighbor coordinate exists in the map
                if (positions.containsValue(neighbor)) {
                    totalCommonSides++;
                }
            }
        }

        // Divide by 2 because each common side is counted twice (for both cubes)
        return totalCommonSides / 2;
    }

    public static void main(String[] args) {
        int n = 8;
        List<String[]> instructions = Arrays.asList(
                new String[]{"6", "7", "right"},
                new String[]{"1", "3", "left"},
                new String[]{"7", "8", "top"},
                new String[]{"1", "4", "down"},
                new String[]{"4", "5", "right"},
                new String[]{"5", "6", "down"},
                new String[]{"1", "2", "top"},
                new String[]{"8", "9", "left"}
        );

        // Count common sides
        int result = countCommonSides(n, instructions);
        System.out.println("Total common sides: " + result);
    }
}
