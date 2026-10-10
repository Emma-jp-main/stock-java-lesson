public class Main {
    void main() {
        IO.println("株式取引システムを開始します。");
        boolean running = true;
        while(running) {
            IO.println("操作するメニューを選んでください。");
            IO.println(" A: 銘柄マスタ一覧表示");
            IO.println(" B: 銘柄マスタ新規登録");
            IO.println(" Q: アプリケーションを終了する");
            IO.print("入力してください: ");
            String userInput = IO.readln();
            switch (userInput) {
                case "A" -> IO.println("「銘柄マスタ一覧表示」が選択されました。");
                case "B" -> IO.println("「銘柄マスタ新規登録」が選択されました。");
                case "Q" -> {
                    IO.println("アプリケーションを終了します。");
                    running = false;
                }
                case null, default ->
//                        System.out.printf("\"%s\" に対応するメニューは存在しません。%n", userInput);
                        IO.println("\"%s\" に対応するメニューは存在しません。".formatted(userInput));
            }
        }
    }
}
