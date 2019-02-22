package my.self.cracking.arrays_strings;

public class OneChange {

    public static void main(String[] args) {
        String source = "acde";
        String target1insert = "acfde";
        String target1replace = "acdf";
        String target1remove = "ade";

        String target2insert = "avcfde";
        String target2replace = "bcdf";
        String target2remove = "ad";

        System.out.println(oneChange(source, target1insert));
        System.out.println(oneChange(source, target1remove));
        System.out.println(oneChange(source, target1replace));
        System.out.println(oneChange(source, target2insert));
        System.out.println(oneChange(source, target2remove));
        System.out.println(oneChange(source, target2replace));

    }

    private static boolean oneChange(String from, String to) {

        return false;
    }
}
