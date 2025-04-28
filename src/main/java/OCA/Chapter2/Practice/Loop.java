package OCA.Chapter2.Practice;

// Ch5 test38
public class Loop {
    // Click debug button
    private static int count;
    private static String[] stops = new String[]{"Washington","Monroe","Jackson","LaSalle"};
    public static void main(String[] args) {
        while (count < stops.length){
            if (stops[count++].length() < 8){
                continue;// Skip the rest of the loop body
                // Indicate rest of the loop body as 'R'
                // R
                // R
                // R
                // R
            }
            // R
            // R
            // R
        }
        System.out.println(count);
    }
}
