import java.util.*;

class Box {
    private Set<Card> cards;
    private int minX, maxX, minY, maxY, minZ, maxZ;

    public Box() {
        this.cards = new HashSet<>();
        this.minX = Integer.MAX_VALUE;
        this.maxX = Integer.MIN_VALUE;
        this.minY = Integer.MAX_VALUE;
        this.maxY = Integer.MIN_VALUE;
        this.minZ = Integer.MAX_VALUE;
        this.maxZ = Integer.MIN_VALUE;
    }

    public void addCard(int x, int y, int z, String plane) {
        List<int[]> corners;
        if (plane.equals("xy")) {
            corners = Arrays.asList(
                    new int[]{x, y, z}, new int[]{x + 1, y, z},
                    new int[]{x, y + 1, z}, new int[]{x + 1, y + 1, z}
            );
        } else if (plane.equals("yz")) {
            corners = Arrays.asList(
                    new int[]{x, y, z}, new int[]{x, y + 1, z},
                    new int[]{x, y, z + 1}, new int[]{x, y + 1, z + 1}
            );
        } else {
            corners = Arrays.asList(
                    new int[]{x, y, z}, new int[]{x + 1, y, z},
                    new int[]{x, y, z + 1}, new int[]{x + 1, y, z + 1}
            );
        }

        for (int[] corner : corners) {
            cards.add(new Card(corner[0], corner[1], corner[2], plane));
            minX = Math.min(minX, corner[0]);
            maxX = Math.max(maxX, corner[0]);
            minY = Math.min(minY, corner[1]);
            maxY = Math.max(maxY, corner[1]);
            minZ = Math.min(minZ, corner[2]);
            maxZ = Math.max(maxZ, corner[2]);
        }
    }

    public int getVolume() {
        return (maxX - minX) * (maxY - minY) * (maxZ - minZ);
    }

    public String findMissingCard() {
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                for (int z = minZ; z <= maxZ; z++) {
                    if (!isPointCovered(x, y, z)) {
                        String missingPlane = findMissingPlane(x, y, z);
                        if (missingPlane != null) {
                            return x + " " + y + " " + z + " " + missingPlane;
                        }
                    }
                }
            }
        }
        return null;
    }

    private boolean isPointCovered(int x, int y, int z) {
        if (x == minX || x == maxX || y == minY || y == maxY || z == minZ || z == maxZ) {
            for (Card card : cards) {
                if (pointInCard(x, y, z, card)) return true;
            }
            return false;
        }
        return true;
    }

    private boolean pointInCard(int x, int y, int z, Card card) {
        int cx = card.x, cy = card.y, cz = card.z;
        String plane = card.plane;
        switch (plane) {
            case "xy":
                return x >= cx && x <= cx + 1 && y >= cy && y <= cy + 1 && z == cz;
            case "yz":
                return x == cx && y >= cy && y <= cy + 1 && z >= cz && z <= cz + 1;
            case "xz":
                return x >= cx && x <= cx + 1 && y == cy && z >= cz && z <= cz + 1;
        }
        return false;
    }

    private String findMissingPlane(int x, int y, int z) {
        if (x == minX || x == maxX) return "yz";
        if (y == minY || y == maxY) return "xz";
        if (z == minZ || z == maxZ) return "xy";
        return null;
    }
}

class Card {
    int x, y, z;
    String plane;

    public Card(int x, int y, int z, String plane) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.plane = plane;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return x == card.x && y == card.y && z == card.z && Objects.equals(plane, card.plane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, plane);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Box box = new Box();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int z = Integer.parseInt(input[2]);
            String plane = input[3];
            box.addCard(x, y, z, plane);
        }

        String missingCard = box.findMissingCard();
        if (missingCard == null) {
            System.out.println(box.getVolume());
        } else {
            System.out.println(missingCard);
        }
        scanner.close();
    }
}
