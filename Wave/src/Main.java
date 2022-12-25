import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задаем размер поля
        MapSize size = FieldSize();
        int X = size.X;
        int Y = size.Y;

        // координаты начальной и конечной точек
        int[] StartEndCord = InitialCoordinates(X, Y);

        int[][] AreaMap = CreateArray(X, Y, StartEndCord);
        printGameField(AreaMap);
        AreaMap = Wave(StartEndCord, AreaMap);
        System.out.print("\n");
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.print("\n");
        printGameField(AreaMap);System.out.print("\n");

    }

    // Задаем размер поля
    static public MapSize FieldSize() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Введите размер игрового поля X на Y  \n");
        System.out.printf("X : ");
        int X = myScan.nextInt();
        System.out.printf("Y : ");
        int Y = myScan.nextInt();


        return new MapSize(X, Y);
    }

    //Задаем координаты
    static int[] InitialCoordinates(int X, int Y) {
        Scanner myScan = new Scanner(System.in);

        // начальные координаты
        System.out.printf("Пожалуйста введите координаты старта # # через пробел. \n");
        System.out.printf("Координата X от 1 и не больше %d ", X - 2);

        String StartInput = myScan.nextLine();
        String[] start = StartInput.split(" ");

        // задаем конечные координаты
        System.out.printf("Пожалуйста введите координаты конечной точки через пробел. \n");
        System.out.printf("координата Y от 1 и не больше %d ", Y - 2);
        String EndInput = myScan.nextLine();
        String[] end = EndInput.split(" ");

        // myScan.close();

        // массив с координатами
        int[] StartEndCoordinates = new int[4];
        StartEndCoordinates[0] = Integer.parseInt(start[0]);
        StartEndCoordinates[1] = Integer.parseInt(start[1]);
        StartEndCoordinates[2] = Integer.parseInt(end[0]);
        StartEndCoordinates[3] = Integer.parseInt(end[1]);
        return StartEndCoordinates;
    }

    static public int[][] CreateArray(int X, int Y, int[] StartEndCoordinates) {

        int[][] GameField = new int[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                GameField[i][j] = 0;
            }
        }
        GameField[StartEndCoordinates[0]][StartEndCoordinates[1]] = 1;
        GameField[StartEndCoordinates[2]][StartEndCoordinates[3]] = -9;

        // Рисуем барьер на поле
        for (int i = 0; i < GameField.length; i++) {
            GameField[0][i] = -2;
        }
        for (int i = 0; i < GameField.length; i++) {
            GameField[i][0] = -2;
        }
        for (int i = 0; i < GameField.length; i++) {
            GameField[GameField.length - 1][i] = -2;
        }
        for (int i = 0; i < GameField.length; i++) {
            GameField[i][GameField.length - 1] = -2;
        }

        return GameField;

    }


    // Печатаем игровое поле
    static public void printGameField(int[][] GameField) {

        for (int i = 0; i < GameField.length; i++) {
            for (int j = 0; j < GameField[0].length; j++) {
                System.out.print(GameField[i][j] + " ");
            }
            System.out.println();

        }
    }

//    static public Position CurrentPos(int[] StartEndCord) {
//        int Pos1 = StartEndCord[0];
//        int Pos2 = StartEndCord[1];
//
//        return new Position(Pos1, Pos2);
//    }


    static public int[][] Wave(int[] StartEndCord, int[][] AreaMap) {

        Deque<Position> CoordQueue = new ArrayDeque<Position>();
        Position loc = new Position();
        loc.pos1 = StartEndCord[0];
        loc.pos2 = StartEndCord[1];
        CoordQueue.add(loc);
        System.out.print("CoordQueue.getFirst().pos1 - ");
        System.out.print(CoordQueue.getFirst().pos1);
        System.out.print("\n");
        System.out.print("CoordQueue.getFirst().pos2 - ");
        System.out.print(CoordQueue.getFirst().pos2);

        System.out.print("\n");
        System.out.print("AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2 - \n]");
        System.out.print(AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2]);
        int count = 0;
        System.out.print("\n");


       while (AreaMap[StartEndCord[2]][StartEndCord[3]] == -9 && count<3)

        {

            if (AreaMap[CoordQueue.getFirst().pos1-1][CoordQueue.getFirst().pos2] == 0){
                AreaMap[CoordQueue.getFirst().pos1-1][CoordQueue.getFirst().pos2] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2]+1;
            }

            if (AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2+1] == 0){
                AreaMap[CoordQueue.getFirst().pos1-1][CoordQueue.getFirst().pos2] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2]+1;
            }
            if (AreaMap[CoordQueue.getFirst().pos1+1][CoordQueue.getFirst().pos2] == 0){
                AreaMap[CoordQueue.getFirst().pos1-1][CoordQueue.getFirst().pos2] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2]+1;
            }
            if (AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2-1] == 0) {
                System.out.println("test 4 ");
                AreaMap[CoordQueue.getFirst().pos1-1][CoordQueue.getFirst().pos2] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2]+1;
            }
            count++;
        }


/*
        int height = AreaMap.length - 2;
        int width = AreaMap[0].length - 2;

        // координата начальной точки, чтобы второй волне не выходили за пределы массива
        int w = StartEndCord[0];
        System.out.printf("координат w - %d", w);
        int h = StartEndCord[1];
        System.out.printf("координат h - %d", h);

        do {
            System.out.println("Test 1 ");
            // поиск вправо и вниз от начальной точки
            for (int i = StartEndCord[0]; i < width; i++) {
                for (int j = StartEndCord[1]; j < height; j++) {

                    if (AreaMap[i + 1][j] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i + 1][j] = AreaMap[i][j] + 1;
                    if (AreaMap[i][j + 1] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i][j + 1] = AreaMap[i][j] + 1;
                    if (AreaMap[i - 1][j] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i - 1][j] = AreaMap[i][j] + 1;
                    if (AreaMap[i][j - 1] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i][j - 1] = AreaMap[i][j] + 1;
                }
            }
            // поиск влево и вверх от начальной точки
            for (int i = StartEndCord[0]; i < width-w; i--) {
                for (int j = StartEndCord[1]; j < height-h; j--) {

                    if (AreaMap[i + 1][j] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i + 1][j] = AreaMap[i][j] + 1;
                    if (AreaMap[i][j + 1] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i][j + 1] = AreaMap[i][j] + 1;
                    if (AreaMap[i - 1][j] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i - 1][j] = AreaMap[i][j] + 1;
                    if (AreaMap[i][j - 1] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i][j - 1] = AreaMap[i][j] + 1;
                }count++;
            }
        }
        while (AreaMap[StartEndCord[2]][StartEndCord[3]] == -9 ) ;//&& count < 50
        AreaMap[StartEndCord[2]][StartEndCord[3]] = -9;*/
        return AreaMap;
    }
}
/*
                    // пока конечная точка не изменена
                    if (AreaMap[StartEndCord[2]][StartEndCord[3]] != -9) {
                        finished = true;
                        System.out.print("Мы достигли цели");

                         for (int i = StartEndCord[0]; i < width; i++) {
                for (int j = StartEndCord[1]; j < height; j++) {

                    if (AreaMap[i + 1][j] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i + 1][j] = AreaMap[i][j] + 1;
                    if (AreaMap[i][j + 1] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i][j + 1] = AreaMap[i][j] + 1;
                    if (AreaMap[i - 1][j] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i - 1][j] = AreaMap[i][j] + 1;
                    if (AreaMap[i][j - 1] == 0 || AreaMap[i + 1][j] == -9) AreaMap[i][j - 1] = AreaMap[i][j] + 1;
                }
            }

*/
