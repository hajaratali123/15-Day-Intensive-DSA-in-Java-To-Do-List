package recursion.Intermediate_Level;

public class TowerOfHanoi {
    static void towerOfHanoi(int n, char src, char aux, char dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, aux);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}
