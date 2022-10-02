public class Chess {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1, x2 = 2, y2 = 2;
        //x - горизонталь, y - вертикаль

        //pawn (пешка)
        boolean pawn = x1 == x2 && y1+1 == y2;
        System.out.println("pawn: " + pawn);

        //bishop (слон)
        boolean bishop = Math.abs(x2-x1)==Math.abs(y2-y1);
        System.out.println("bishop: " + bishop);

        //rook (ладья)
        boolean rook = x1 == x2 || y1 == y2;
        System.out.println("rook: " + rook);

        //knight (конь)
        boolean knight = (Math.abs(x2-x1) == 1 && Math.abs(y2-y1) == 2) || (Math.abs(y2-y1) == 1 && Math.abs(x2-x1) == 2);
        System.out.println("knight: " + knight);

        //king (король) Math.abs(x2-x1) == 1
        boolean king = (x1 == x2 && Math.abs(y2-y1) == 1) || (y1 == y2 && Math.abs(x2-x1) == 1) || (Math.abs(x2-x1) == 1 && Math.abs(y2-y1) == 1);
        // 3 условия:  1)вверх-вниз на 1 клетку           || 2)влево-вправо на 1 клетку         || 3)по диагонали на 1 клетку
        System.out.println("king: " + king);

        //queen (ферзь)
        boolean queen = x1 == x2 || y1 == y2 || Math.abs(x2-x1)==Math.abs(y2-y1); // ладья + слон
        System.out.println("queen: " + queen);
    }
}
