class Java4{
    public static void main(String[] args) {
        final int TOUCHDOWN = 6 ;
        final int CONVERSION = 1 ;
        final int FIELDGOAL = 3 ;
        int td, pat, fg, total;
        td = 7 * TOUCHDOWN ;
        pat = 2 * CONVERSION ;
        fg = 4 * FIELDGOAL ;
        total = ( td + pat + fg);
        System.out.println("Score = " + total);
    }
}