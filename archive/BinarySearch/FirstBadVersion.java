package archive.BinarySearch;

public class FirstBadVersion{

    int bad = 4;
    boolean isBadVersion(int version) {
        return version >= bad;
    }

}

class VersionControl extends FirstBadVersion{

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
     public static void main(String[] args) {
        int n=5;
        VersionControl obj = new VersionControl();
        System.out.println(obj.firstBadVersion(n));
    }
}
