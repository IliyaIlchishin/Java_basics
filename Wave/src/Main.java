import java.awt.geom.Area;
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
        printGameField(AreaMap);
        System.out.print("\n");
        System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        AreaMap = BackRoute(StartEndCord, AreaMap);
        System.out.print("\n");
        printGameField(AreaMap);
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

    public static int[][] CopyArray (int[][] AreaMap) {
        if (AreaMap == null) {
            return null;
        }

        int[][] copy = new int[AreaMap.length][];

        for (int i = 0; i < AreaMap.length; i++) {
            copy[i] = new int[AreaMap[i].length];
            System.arraycopy(AreaMap[i], 0, copy[i], 0, AreaMap[i].length);
        }

        return copy;
    }

    static public int[][] Wave(int[] StartEndCord, int[][] AreaMap) {


        Deque<Position> CoordQueue = new ArrayDeque<Position>();
        Position loc = new Position(StartEndCord[0], StartEndCord[1]);
        CoordQueue.add(loc);


        while (AreaMap[StartEndCord[2]][StartEndCord[3]] == -9) {

            if (AreaMap[CoordQueue.getFirst().pos1 - 1][CoordQueue.getFirst().pos2] == 0 || AreaMap[CoordQueue.getFirst().pos1 - 1][CoordQueue.getFirst().pos2] == -9) {
                AreaMap[CoordQueue.getFirst().pos1 - 1][CoordQueue.getFirst().pos2] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2] + 1;
                Position loc1 = new Position(CoordQueue.getFirst().pos1 - 1, CoordQueue.getFirst().pos2);
                CoordQueue.add(loc1);
            }

            if (AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2 + 1] == 0 || AreaMap[CoordQueue.getFirst().pos1 - 1][CoordQueue.getFirst().pos2] == -9) {
                AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2 + 1] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2] + 1;
                Position loc2 = new Position(CoordQueue.getFirst().pos1, CoordQueue.getFirst().pos2 + 1);
                CoordQueue.add(loc2);
            }
            if (AreaMap[CoordQueue.getFirst().pos1 + 1][CoordQueue.getFirst().pos2] == 0 || AreaMap[CoordQueue.getFirst().pos1 - 1][CoordQueue.getFirst().pos2] == -9) {
                AreaMap[CoordQueue.getFirst().pos1 + 1][CoordQueue.getFirst().pos2] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2] + 1;
                Position loc3 = new Position(CoordQueue.getFirst().pos1 + 1, CoordQueue.getFirst().pos2);
                CoordQueue.add(loc3);
            }
            if (AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2 - 1] == 0 || AreaMap[CoordQueue.getFirst().pos1 - 1][CoordQueue.getFirst().pos2] == -9) {
                AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2 - 1] = AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2] + 1;
                Position loc4 = new Position(CoordQueue.getFirst().pos1, CoordQueue.getFirst().pos2 - 1);
                CoordQueue.add(loc4);
            }

            CoordQueue.pollFirst();

        }

        System.out.print("Конечная точка найдена");
        int min = AreaMap[StartEndCord[2]-1][StartEndCord[3]];
        if ( min > AreaMap[StartEndCord[2]][StartEndCord[3]+1] ) min = AreaMap[StartEndCord[2]-1][StartEndCord[3]];
        if ( min > AreaMap[StartEndCord[2]+1][StartEndCord[3]] ) min = AreaMap[StartEndCord[2]-1][StartEndCord[3]];
        if ( min > AreaMap[StartEndCord[2]][StartEndCord[3]-1] ) min = AreaMap[StartEndCord[2]-1][StartEndCord[3]];
        // помечаем конечную точку последним наименьшим шагом +1, чтобы далее от этой точке в поиске пути строить маршрут обратно
        AreaMap[StartEndCord[2]][StartEndCord[3]] = min+1;

        return AreaMap;

    }

    static public int [][] BackRoute (int[] StartEndCord,int[][] AreaMap)
    {
        //копия карты на которой будем отмечать маршрут от конечной координаты до начальной, что
        int[][] MapWithRoute = CopyArray(AreaMap);


        Deque<Position> CoordQueue = new ArrayDeque<Position>();
        Position loc = new Position(StartEndCord[2], StartEndCord[3]);
        CoordQueue.add(loc);


            // AreaMap
        while (MapWithRoute [StartEndCord[0]][StartEndCord[1]] == 1 )

        {

            if (AreaMap[CoordQueue.getFirst().pos1-1][CoordQueue.getFirst().pos2] < AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2]  &&
                    AreaMap[CoordQueue.getFirst().pos1-1][CoordQueue.getFirst().pos2] > 0) {
                MapWithRoute [CoordQueue.getFirst().pos1 - 1][CoordQueue.getFirst().pos2] = 0;
                Position loc1 = new Position(CoordQueue.getFirst().pos1 - 1, CoordQueue.getFirst().pos2);
                CoordQueue.add(loc1);

            }
            else if (AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2+1] < AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2] &&
                    AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2+1] > 0) {
                MapWithRoute [CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2+1] = 0;
                Position loc1 = new Position(CoordQueue.getFirst().pos1, CoordQueue.getFirst().pos2+1);
                CoordQueue.add(loc1);
            }
            else if (AreaMap[CoordQueue.getFirst().pos1+1][CoordQueue.getFirst().pos2] == AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2]&&
                    AreaMap[CoordQueue.getFirst().pos1+1][CoordQueue.getFirst().pos2] > 0) {
                MapWithRoute [CoordQueue.getFirst().pos1+1][CoordQueue.getFirst().pos2] = 0;
                Position loc1 = new Position(CoordQueue.getFirst().pos1+1, CoordQueue.getFirst().pos2);
                CoordQueue.add(loc1);
            }

            else if (AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2-1] < AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2] &&
            AreaMap[CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2-1] > 0) {
                MapWithRoute [CoordQueue.getFirst().pos1][CoordQueue.getFirst().pos2-1] = 0;
                Position loc1 = new Position(CoordQueue.getFirst().pos1, CoordQueue.getFirst().pos2-1);
                CoordQueue.add(loc1);
            }
            CoordQueue.pollFirst();
        }


        System.out.print("Маршрут построен");
        AreaMap[StartEndCord[0]][StartEndCord[1]] = 1;
        return MapWithRoute;
    }


}


