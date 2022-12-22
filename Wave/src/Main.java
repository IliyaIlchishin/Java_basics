import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задаем размер поля
        MapSize size = FieldSize();
        int X = size.X;
        int Y = size.Y;

        // координаты начальной и конечной точек
        int [] StartEndCord = coordinates(X,Y);

        String [][] Map = CreateArray(X,Y,StartEndCord);
        printGameField(Map);

        }

    // Задаем размер поля
    static public MapSize FieldSize() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Пожалуйста размер игрового поля X на Y  \n");
        System.out.printf("X : ");
        int X = myScan.nextInt();
        System.out.printf("Y : ");
        int Y = myScan.nextInt();


        return new MapSize(X, Y);
    }

    //Задаем координаты
    static int[] coordinates(int X, int Y) {
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

    static public String[][] CreateArray(int X, int Y, int[] StartEndCoordinates) {

        String[][] GameField = new String[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                GameField[i][j] = "0";
            }
        }
        GameField[StartEndCoordinates[0]][StartEndCoordinates[1]] = "X";
        GameField[StartEndCoordinates[2]][StartEndCoordinates[3]] = "Y";

        // Рисуем барьер на поле
        for (int i = 0; i < GameField.length; i++) {
            GameField[0][i] = "S";
        }
        for (int i = 0; i < GameField.length; i++) {
            GameField[i][0] = "S";
        }
        for (int i = 0; i < GameField.length; i++) {
            GameField[GameField.length - 1][i] = "S";
        }
        for (int i = 0; i < GameField.length; i++) {
            GameField[i][GameField.length - 1] = "S";
        }

        return GameField;

    }

    // Печатаем игровое поле
    static public void printGameField(String[][] GameField) {

        for (int i = 0; i < GameField.length; i++) {
            for (int j = 0; j < GameField[0].length; j++) {
                System.out.print(GameField[i][j] + " ");
            }
            System.out.println();
        }
    }

}